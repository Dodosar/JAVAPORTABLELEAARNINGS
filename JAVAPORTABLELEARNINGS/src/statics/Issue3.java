package statics;

public class Issue3 {

    public static void main(String[] args) {
    	Integer x = 111222333;
    	Integer y = Integer.valueOf("111222333");
    	Integer z = new Integer(111222333);
    	
        System.out.println(x==y);
        System.out.println(y==z);
        System.out.println(x==z);
    }
    
}
