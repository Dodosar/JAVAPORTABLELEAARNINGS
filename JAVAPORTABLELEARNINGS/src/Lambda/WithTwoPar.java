package Lambda;

interface StringConcat {

    public String sconcat(String a, String b);
}

public class WithTwoPar {

	   public static void main(String args[]) {
	        // lambda expression with multiple arguments
	    	StringConcat s = (a, b) -> a + b;
	        System.out.println("Result: "+s.sconcat("Hello ", "World"));
	    }
	}