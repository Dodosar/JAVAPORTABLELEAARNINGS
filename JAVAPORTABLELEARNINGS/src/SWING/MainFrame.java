package SWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new MainFrame(); 
	}

	/**
	 * @throws HeadlessException
	 */
	public MainFrame() throws HeadlessException {
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
		contentPane.add(new JButton("Haha"), BorderLayout.WEST);
		contentPane.add(new JTextField("Hello"), BorderLayout.SOUTH);
		contentPane.add(new JTextArea("jjjj"), BorderLayout.CENTER);
	}
	
}
