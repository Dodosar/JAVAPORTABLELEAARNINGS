package SWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MainfMFrameWithListeners extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b;
	private JTextField textField;
	private JTextArea textArea;
	private DefaultListModel model;

	public static void main(String[] args) {
		new MainfMFrameWithListeners(); 
	}

	/**
	 * @throws HeadlessException
	 */
	public MainfMFrameWithListeners() throws HeadlessException {
		super();
		
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();  //getCrossPlatformLookAndFeelClassName()
    	
    	try {
    	    UIManager.setLookAndFeel(lookAndFeel);
    	} catch (Exception e) { }
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
		setTitle("Hello");
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setBackground(Color.GREEN);
		
		setPreferredSize(new  Dimension(500, 400));
		
		setLocationRelativeTo(null);
		
		//setSize(500, 400);
		
		addComponents(getContentPane());
		
		pack(); // need to require before setVisibel. In memory to do graffic paint
		/*if to do pack like a comment, then will show in 500 -400 size */
		
		setVisible(true);// this method must be in the end of code	
		
	}

	private void addComponents(Container contentPane) {
		
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(new JPanel(), BorderLayout.NORTH);
		
		ButtonAction action = new ButtonAction("Clicked me!"); 
		b = new JButton(action);
		contentPane.add(b, BorderLayout.WEST);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button click");
				textArea.setText(textField.getText());
				textArea.setBackground(Color.BLUE);
				//textArea.setBackground(new Color(105,1,2));
				System.out.println(e.getSource());
				model.addElement("CC");
				
				
			}
		});
		textField = new JTextField("Hello");
		contentPane.add(textField, BorderLayout.SOUTH);
		
		textArea = new JTextArea("jjjj"); 
		contentPane.add(textArea, BorderLayout.CENTER);
		
		textArea.addPropertyChangeListener("background", new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				System.out.println(String.format("Old: %s, New: %s", evt.getOldValue(), evt.getNewValue()));
				
				
				action.setEnabled(false);// to disable button after clicked 
			}
		});
		
		JList list = new JList();
		list.setPreferredSize(new Dimension(100,15));
		contentPane.add(list, BorderLayout.EAST);
		
		model = new DefaultListModel<>();
		list.setModel(model);
		
		model.addElement("AA");
		model.addElement("BB");
	}
	
}
