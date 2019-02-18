import java.awt.Rectangle;

public class TestBird {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Bird();   // Animal reference but Dog object
      Bird c = new Bird();
      Bird obj = new Bird();

      //a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
      c.bark();
      obj.Area();
   }
}
