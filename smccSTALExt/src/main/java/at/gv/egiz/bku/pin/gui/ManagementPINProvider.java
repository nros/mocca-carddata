/*
 * Copyright 2008 Federal Chancellery Austria and
 * Graz University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.gv.egiz.bku.pin.gui;

import at.gv.egiz.bku.gui.BKUGUIFacade;
import at.gv.egiz.bku.gui.PINManagementGUIFacade;
import at.gv.egiz.smcc.CancelledException;
import at.gv.egiz.smcc.PINSpec;
import at.gv.egiz.smcc.pin.gui.ModifyPINProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ManagementPINProvider extends AbstractPINProvider implements ModifyPINProvider {

  protected static final Log log = LogFactory.getLog(ManagementPINProvider.class);
  protected PINManagementGUIFacade gui;
  protected PINManagementGUIFacade.DIALOG type;
  private boolean retry = false;

  public ManagementPINProvider(PINManagementGUIFacade gui, PINManagementGUIFacade.DIALOG type) {
    this.gui = gui;
    this.type = type;
  }

  @Override
  public char[] provideCurrentPIN(PINSpec spec, int retries)
          throws CancelledException, InterruptedException {

    gui.showPINDialog(type, spec, (retry) ? retries : -1,
            this, "change",
            this, "cancel");

    log.trace("[" + Thread.currentThread().getName() + "] wait for action");
    waitForAction();
    log.trace("[" + Thread.currentThread().getName() + "] received action " + action);

    gui.showMessageDialog(BKUGUIFacade.TITLE_WAIT,
            BKUGUIFacade.MESSAGE_WAIT);

    if ("cancel".equals(action)) {
      throw new CancelledException(spec.getLocalizedName() +
              " entry cancelled");
    }
    retry = true;
    return gui.getOldPin();
  }

  @Override
  public char[] provideNewPIN(PINSpec spec)
          throws CancelledException, InterruptedException {
    
    char[] pin = gui.getPin();
    if (pin != null) {
      // change pin dialog also returns new pin
      return pin;
    }

    gui.showPINDialog(type, spec, -1,
            this, "activate",
            this, "cancel");

    log.trace("[" + Thread.currentThread().getName() + "] wait for action");
    waitForAction();
    log.trace("[" + Thread.currentThread().getName() + "] received action " + action);

    gui.showMessageDialog(BKUGUIFacade.TITLE_WAIT,
              BKUGUIFacade.MESSAGE_WAIT);

    if ("cancel".equals(action)) {
      throw new CancelledException(spec.getLocalizedName() +
              " entry cancelled");
    }
    return gui.getPin();
  }
}