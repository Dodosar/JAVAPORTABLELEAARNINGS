package AbstractClass;

import java.awt.*;

public class Issue2 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal{
    	
        public String getName() {
            return "Fox";
        }
    }
}