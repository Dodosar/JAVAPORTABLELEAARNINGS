package StackTrace;

public class ExcepUncheckedException {
	public static void main(String[] args) {
        processExceptions(new ExcepUncheckedException());
    }

    public static void processExceptions(ExcepUncheckedException obj) {
        try
        {
    	obj.method1();
        obj.method2();
        obj.method3();
        }
        catch(Throwable e){
        	printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}