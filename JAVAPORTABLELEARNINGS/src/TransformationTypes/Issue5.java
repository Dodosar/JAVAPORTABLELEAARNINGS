package TransformationTypes;

public class Issue5 {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (int) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}