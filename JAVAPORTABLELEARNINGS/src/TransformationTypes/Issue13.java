package TransformationTypes;

public class Issue13 {
    public static int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
    	Issue13 solution = new Issue13();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Issue13.D = 5 * D * C;

        Issue13.D = 5;
    }

    public int getA() {
        return A;
    }

}
