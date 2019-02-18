package TransformationTypes;

public class Issue6 {
    public static void main(String[] args) {
        short b = (short) 45;
        char c =  'c';
        short s = (short) 1005.22;
        int i = (int) 150000;
        float f = (float) 4.10f;
        double d = (double) 1.256d;
        double result = (f * b) + (i / c) - (d * s) + 562.78d;
        System.out.println("result: " + result);
    }
}