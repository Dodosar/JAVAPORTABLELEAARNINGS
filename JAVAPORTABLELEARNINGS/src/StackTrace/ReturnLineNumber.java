package StackTrace;

public class ReturnLineNumber {
	public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElment2 = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElment2[2].getLineNumber());
        return stackTraceElment2[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElment3 = Thread.currentThread().getStackTrace();
        return stackTraceElment3[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElment4 = Thread.currentThread().getStackTrace();
        return stackTraceElment4[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElment5 = Thread.currentThread().getStackTrace();
        return stackTraceElment5[2].getLineNumber();
    }

    public static int method5() {
    	StackTraceElement[] stackTraceElment6 = Thread.currentThread().getStackTrace();
        return stackTraceElment6[2].getLineNumber();
    }
}