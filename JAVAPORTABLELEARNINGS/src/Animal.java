import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Area;


class Animal {
   public void move() {
      System.out.println("Animals can move");
      
      
      
   }
}

class Bird extends Animal {
   public void move() {
      System.out.println("Bird can walk and run");
      
      
   }
   public void bark() {
      System.out.println("Bird can bark");
   }
   
   public void Area(){
	   int pi = 314;
	   int a = pi * 2;
	   System.out.println(a);
   }
}

