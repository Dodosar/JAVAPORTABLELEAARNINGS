package StackTrace;

public class ExceptionClass {
	public static void main(String[] args) throws Exception {
	try{
        int a = 42 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
}
}