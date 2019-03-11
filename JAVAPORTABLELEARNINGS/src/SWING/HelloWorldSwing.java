package SWING;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.*;        

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	
	
	
    private static void createAndShowGUI() {
    	String lookAndFeel = null;
        String[] patternExamples = {
                "dd MMMMM yyyy",
                "dd.MM.yy",
                "MM/dd/yy",
                "yyyy.MM.dd G 'at' hh:mm:ss z",
                "EEE, MMM d, ''yy",
                "h:mm a",
                "H:mm:ss:SSS",
                "K:mm a,z",
                "yyyy.MMMMM.dd GGG hh:mm aaa"
       };

    	lookAndFeel = UIManager.getSystemLookAndFeelClassName();  //getCrossPlatformLookAndFeelClassName()
    	
    	try {
    	    UIManager.setLookAndFeel(lookAndFeel);
    	} catch (Exception e) { }
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   


        JMenuBar setJMenuBar = new JMenuBar();
        JMenu menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        setJMenuBar.add(menu);
        frame.setJMenuBar(setJMenuBar);
        
 
       
       JComboBox patternList = new JComboBox(patternExamples);
       patternList.setEditable(true);
       patternList.addActionListener(patternList);
        
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label, BorderLayout.EAST); 
        frame.add(patternList, BorderLayout.AFTER_LAST_LINE);

        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
                createAndShowGUI();
            }
        });
    }
}