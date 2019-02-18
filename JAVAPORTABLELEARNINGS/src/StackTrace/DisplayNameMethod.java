package StackTrace;

/* 
И снова StackTrace
*/

public class DisplayNameMethod {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElment1 = Thread.currentThread().getStackTrace();
        return stackTraceElment1[2].getMethodName();
        
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElment2 = Thread.currentThread().getStackTrace();
        return stackTraceElment2[2].getMethodName();
        
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElment3 = Thread.currentThread().getStackTrace();
        return stackTraceElment3[2].getMethodName();
        
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElment4 = Thread.currentThread().getStackTrace();
        return stackTraceElment4[2].getMethodName();
        
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElment5 = Thread.currentThread().getStackTrace();
        return stackTraceElment5[2].getMethodName();
        
    }
}
