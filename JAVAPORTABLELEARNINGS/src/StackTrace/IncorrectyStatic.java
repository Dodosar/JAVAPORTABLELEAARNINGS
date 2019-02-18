package StackTrace;

public class IncorrectyStatic {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;
    

    public static void main(String[] args) {
    	IncorrectyStatic room = new IncorrectyStatic();
        room.A = 11;

        room.D = 15;
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(D);
    }

    public int getA() {
        return A;
    }

}