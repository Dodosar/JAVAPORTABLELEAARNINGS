package AWT;

import java.awt.*;
public class Example2 {
   Example2()
   { Button b=new Button("Button!!"); 
      //Creating Frame    
      Frame fr=new Frame();       
      
      //Creating a label
      Label lb = new Label("UserId: "); 
      
      b.setBounds(100,100,50,50);  
      
      fr.add(b); 
      
      //Setting Frame width and height
      b.setSize(500,300); 
      
      //Setting the title of Frame
      fr.setTitle("This is my First AWT example"); 
      
      //adding label to the frame
      fr.add(lb);           
      
      //Creating Text Field
      TextField t = new TextField();
      
      //adding text field to the frame
      fr.add(t);
      
      //setting frame size
      fr.setSize(500, 300);  
      
      //Setting the layout for the Frame
      fr.setLayout(new FlowLayout());
            
      fr.setVisible(true);                
   }
   public static void main(String args[])
   {
       Example2 ex = new Example2(); 
   }
}