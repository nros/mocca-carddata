/*
 * Copyright 2012 by A-SIT, Secure Information Technology Center Austria
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */
package at.asit.pdfover.gui.controls;

// Imports
import java.io.InputStream;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class ErrorMarker extends Label {

	/**
	 * SLF4J Logger instance
	 **/
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory
			.getLogger(ErrorMarker.class);

	private static final String IMG_PATH = "/img/error.png"; //$NON-NLS-1$

	Image errorImg;

	/**
	 * Draw an error marker for a faulty entry
	 * @param parent the parent composite
	 * @param style the SWT style
	 * @param message a message describing the error (can be set later through setToolTipText)
	 */
	public ErrorMarker(Composite parent, int style,
			String message) {
		super(parent, style);
		
		InputStream stream = this.getClass().getResourceAsStream(IMG_PATH);

		this.errorImg = new Image(getDisplay(), new ImageData(stream));
		this.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				Image img = ErrorMarker.this.errorImg;
				Rectangle imgSize = img.getBounds();
				Rectangle dstSize = ErrorMarker.this.getBounds();
				e.gc.fillRectangle(0, 0, dstSize.width, dstSize.height);
				e.gc.drawImage(img, 0, 0, imgSize.width, imgSize.height,
						0, 0, dstSize.width, dstSize.height);
			}
		});

		setToolTipText(message);
		
		setImage(this.errorImg);
	}

	@Override
	protected void checkSubclass() {
		// Allow subclassing
	}
}
