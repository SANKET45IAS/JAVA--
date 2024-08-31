/**
 * program4_mathoperation
 */
public class program4_mathoperation {

    static double multiple(double x, double y) {
        return (x * y);
    }

    static double divide(double x, double y) {
        return (x / y);
    }

    public static void main(String[] args) {
        double a, b;
        program4_mathoperation ha = new program4_mathoperation();
        a = ha.multiple(5.0, 6.0);
        System.out.println(a);
        b = ha.divide(a, 6.0);
        System.out.println(b);

    }
}