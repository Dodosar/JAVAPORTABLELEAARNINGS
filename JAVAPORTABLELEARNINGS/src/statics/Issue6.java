package statics;

public class Issue6 {
    public static Cat cat;
    
    public static class Cat{


		public String name; 
    }
    
    static{
    	cat = new Cat();
    	cat.name = "Marpha";
    	System.out.println(cat.name);
    }
    

    public static void main(String[] args) {
    	
    }
}
