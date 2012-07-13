/*
 * Copyright 2011 by Graz University of Technology, Austria
 * MOCCA has been developed by the E-Government Innovation Center EGIZ, a joint
 * initiative of the Federal Chancellery Austria and Graz University of Technology.
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://www.osor.eu/eupl/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 */


package at.gv.egiz.bku.smccstal;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.gv.egiz.bku.gui.BKUGUIFacade;
import at.gv.egiz.bku.pin.gui.VerifyPINGUI;
import at.gv.egiz.smcc.CancelledException;
import at.gv.egiz.smcc.LockedException;
import at.gv.egiz.smcc.NotActivatedException;
import at.gv.egiz.smcc.SignatureCard;
import at.gv.egiz.smcc.SignatureCardException;
import at.gv.egiz.stal.ErrorResponse;
import at.gv.egiz.stal.InfoboxReadRequest;
import at.gv.egiz.stal.InfoboxReadResponse;
import at.gv.egiz.stal.STALRequest;
import at.gv.egiz.stal.STALResponse;

public class InfoBoxReadRequestHandler extends AbstractRequestHandler {

  private final Logger log = LoggerFactory.getLogger(InfoBoxReadRequestHandler.class);
  
//  protected PINProviderFactory pinProviderFactory;

  @Override
  public STALResponse handleRequest(STALRequest request) throws InterruptedException {
    if (request instanceof InfoboxReadRequest) {
      InfoboxReadRequest infoBox = (InfoboxReadRequest) request;
      
      try {
        if (infoBox.getInfoboxIdentifier().equals("IdentityLink")) {
          log.debug("Handling identitylink infobox.");
          byte[] resp = card.getInfobox(infoBox.getInfoboxIdentifier(),
                  new VerifyPINGUI(gui),
                  infoBox.getDomainIdentifier());
          if (resp == null) {
            log.info("Infobox doesn't contain any data. Assume card is not activated.");
            throw new NotActivatedException();
          } else {
            try {
              resp = DomainIdConverter.convertDomainId(resp, infoBox
                  .getDomainIdentifier());
            } catch (Exception e) {
              log.error("Cannot convert domain specific id.", e);
              return new ErrorResponse(1000);
            }
          }
          InfoboxReadResponse stalResp = new InfoboxReadResponse();
          stalResp.setInfoboxValue(resp);
          return stalResp;
        } else if (SignatureCard.KeyboxName.CERTIFIED_KEYPAIR.equals(infoBox.getInfoboxIdentifier()) ||
                   SignatureCard.KeyboxName.SECURE_SIGNATURE_KEYPAIR.equals(infoBox.getInfoboxIdentifier()))
        {
          byte[] resp;
          if (SignatureCard.KeyboxName.CERTIFIED_KEYPAIR.equals(infoBox.getInfoboxIdentifier()))
          {
            log.debug("Handling certified keypair infobox.");
            resp = card.getCertificate(SignatureCard.KeyboxName.CERTIFIED_KEYPAIR, new VerifyPINGUI(gui));
          } else {
            log.debug("Handling secure signature keypair infobox.");
            resp = card.getCertificate(SignatureCard.KeyboxName.SECURE_SIGNATURE_KEYPAIR, new VerifyPINGUI(gui));
          }
          if (resp == null) {
            return new ErrorResponse(6001);
          }

          // Check certificate validity
          try {
            CertificateFactory certFactory = CertificateFactory.getInstance("X509");
            X509Certificate cert = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(resp));
            cert.checkValidity();
            log.info("signing certificate is valid");
          } catch (CertificateExpiredException e) {
              log.warn("signing certificate has expired!");
          } catch (CertificateNotYetValidException e) {
              log.warn("signing certificate is not yet valid!");
          } catch (CertificateException e) {
            log.error("Certificate decoding failed:", e);
          }


          InfoboxReadResponse stalResp = new InfoboxReadResponse();
          stalResp.setInfoboxValue(resp);
          return stalResp;
        } else {
          log.warn("Unknown infobox identifier: {} trying generic request.",
              infoBox.getInfoboxIdentifier());
          byte[] resp = card.getInfobox(infoBox.getInfoboxIdentifier(),
                  new VerifyPINGUI(gui),
                  infoBox.getDomainIdentifier());
          if (resp == null) {
            return new ErrorResponse(6001);
          }
          InfoboxReadResponse stalResp = new InfoboxReadResponse();
          stalResp.setInfoboxValue(resp);
          return stalResp;
        }
      } catch (IllegalArgumentException e) {
        log.info("Infobox {} not supported.", infoBox.getInfoboxIdentifier());
        return new ErrorResponse(4002);
      } catch (NotActivatedException e) {
        log.info("Citizen card not activated.", e);
        gui.showErrorDialog(BKUGUIFacade.ERR_CARD_NOTACTIVATED, null, this, null);
        waitForAction();
        gui.showMessageDialog(BKUGUIFacade.TITLE_WAIT,
                BKUGUIFacade.MESSAGE_WAIT);
        return new ErrorResponse(6001);
      } catch (LockedException e) {
        log.info("Citizen card locked.", e);
        gui.showErrorDialog(BKUGUIFacade.ERR_CARD_LOCKED, null, this, null);
        waitForAction();
        gui.showMessageDialog(BKUGUIFacade.TITLE_WAIT,
                BKUGUIFacade.MESSAGE_WAIT);
        return new ErrorResponse(6001);
      } catch (CancelledException cx) {
        log.debug("User cancelled request.", cx);
        return new ErrorResponse(6001);
      } catch (SignatureCardException e) {
        log.info("Error while reading infobox. " + e);
        return new ErrorResponse(4000);
      }
    } else {
      log.error("Got unexpected STAL request: {}.", request);
      return new ErrorResponse(1000);
    }
  }

  @Override
  public boolean requireCard() {
    return true;
  }
}
