package TransformationTypes;

public class Issue1 {
    public static void main(String[] args) {
    	char a = 0;
        int b = (int) a + 46;
        byte c = (byte) (a * b);
        double f = (double) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
