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
package at.asit.pdfover.gui.workflow.states;

// Imports
import org.eclipse.swt.SWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import at.asit.pdfover.gui.composites.ErrorComposite;
import at.asit.pdfover.gui.workflow.StateMachine;
import at.asit.pdfover.gui.workflow.Status;

/**
 * 
 */
public class ErrorState extends State {
	/**
	 * @param stateMachine
	 */
	public ErrorState(StateMachine stateMachine) {
		super(stateMachine);
	}

	private Exception exception;
	
	private State recoverState = null;
	
	/**
	 * @param recoverState the recoverState to set
	 */
	public void setRecoverState(State recoverState) {
		this.recoverState = recoverState;
	}

	/**
	 * SLF4J Logger instance
	 **/
	static final Logger log = LoggerFactory.getLogger(ErrorState.class);

	private ErrorComposite errorComposite = null;
	
	private ErrorComposite getComposite() {
		if (this.errorComposite == null) {
			this.errorComposite =
					this.stateMachine.getGUIProvider().createComposite(ErrorComposite.class, SWT.RESIZE, this);
		}

		return this.errorComposite;
	}
	
	/* (non-Javadoc)
	 * @see at.asit.pdfover.gui.workflow.states.State#run()
	 */
	@Override
	public void run() {
		Status status = this.stateMachine.getStatus();
		
		ErrorComposite errorComposite = this.getComposite();
		
		if(this.exception != null && !errorComposite.isUserOk()) {
			// Display Exception ....
			this.errorComposite.setException(this.exception);
			
			this.stateMachine.getGUIProvider().display(errorComposite);
			return;
		}
		
		// User was informed! 
		if(this.recoverState != null) {
			// see if we can recover!
			this.setNextState(this.recoverState);
		} else {
			// we cannot recover exit!
			this.stateMachine.exit();
		}
	}

	/* (non-Javadoc)
	 * @see at.asit.pdfover.gui.workflow.states.State#cleanUp()
	 */
	@Override
	public void cleanUp() {
		// TODO
	}

	/* (non-Javadoc)
	 * @see at.asit.pdfover.gui.workflow.states.State#updateMainWindowBehavior()
	 */
	@Override
	public void updateMainWindowBehavior() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Gets the Exception
	 * @return the exception
	 */
	public Exception getException() {
		return this.exception;
	}

	/**
	 * Sets the Exception
	 * @param exception the exception to set
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}

}
