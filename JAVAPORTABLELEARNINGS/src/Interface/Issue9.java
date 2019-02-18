package Interface;

public class Issue9 {
    public static void main(String[] args) throws Exception {
    }
    
    interface Movable{
    	Double speed();
    }
    
    interface Flyable extends Movable{
    	Double speed(Flyable f);
    }
}