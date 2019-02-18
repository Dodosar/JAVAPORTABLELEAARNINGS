package SWING;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

public class ButtonAction extends AbstractAction {
	
	/**
	 * @param paramString
	 */
	public ButtonAction(String paramString) {
		super(paramString);
		// TODO Auto-generated constructor stub
	}
	
	public ButtonAction(String paramString, Icon icon) {
		super(paramString, icon);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent paramActionEvent) {
		// TODO Auto-generated method stub
		System.out.println("action clicked");
	}

	

}
