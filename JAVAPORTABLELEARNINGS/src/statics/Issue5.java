package statics;

public class Issue5 {
    public static int A = 0;

    static {
        //throw an exception here - ��������� ������� ���
    	if (A == 0) throw new RuntimeException(); 
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
