package StackTrace;

/* 
� ����� StackTrace
*/

public class DisplayNameMethod {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElment1 = Thread.currentThread().getStackTrace();
        return stackTraceElment1[2].getMethodName();
        
    }

    public static String method2() {
        method3();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElment2 = Thread.currentThread().getStackTrace();
        return stackTraceElment2[2].getMethodName();
        
    }

    public static String method3() {
        method4();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElment3 = Thread.currentThread().getStackTrace();
        return stackTraceElment3[2].getMethodName();
        
    }

    public static String method4() {
        method5();
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElment4 = Thread.currentThread().getStackTrace();
        return stackTraceElment4[2].getMethodName();
        
    }

    public static String method5() {
        //�������� ��� ��� ���
        StackTraceElement[] stackTraceElment5 = Thread.currentThread().getStackTrace();
        return stackTraceElment5[2].getMethodName();
        
    }
}
