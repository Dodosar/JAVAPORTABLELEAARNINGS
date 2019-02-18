package StackTrace;

public class LogClassMethod {
	public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
    	StackTraceElement[] stackElement = Thread.currentThread().getStackTrace();
    	String MethodName = stackElement[2].getMethodName();
    	String ClassName = stackElement[2].getClassName();
    	System.out.println(ClassName+ ": " +MethodName+ ": " +s);
    }
}
