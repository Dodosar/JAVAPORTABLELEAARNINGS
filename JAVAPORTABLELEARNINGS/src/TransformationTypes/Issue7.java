package TransformationTypes;

public class Issue7 {
    public static void main(String[] args) {
        long l = (long) 111_1111_111_110L;
        int x = (int) 0b1000_1100_1010;
        double m = (double) 110_987_654_6299.123_34;
        float f = (float) l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
        String text = "Object is " + (float) 2 / 3;
        System.out.println(text);
    }
}