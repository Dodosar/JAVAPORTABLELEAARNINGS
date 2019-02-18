package StackTrace;

public class PrintStackTraceException {
    public static void main(String[] args) {
        try 
        {
        divisionByZero();   
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void divisionByZero(){
        int a = 45 / 0;
        System.out.println(a);
    }
}
