package Lambda;

@FunctionalInterface
interface MyFunctionalInterface1 {

	//A method with single parameter
    public int incrementByFive(int a);
}

public class ExampleWithOneParameter {

	   public static void main(String args[]) {
	        // lambda expression with single parameter num
	    	MyFunctionalInterface1 f = (num) -> num+5;
	        System.out.println(f.incrementByFive(22));
	        System.out.println(f.incrementByFive(30));
	    }
	}