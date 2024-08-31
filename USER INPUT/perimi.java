import java.util.Scanner;

class perimi {
    public static void main(String[] args) {
        float a, b, c, d;
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter Length:");
        a = ha.nextFloat();
        System.out.println("Enter Breath:");
        b = ha.nextFloat();
        c = a * b;
        d = 2 * (a + b);
        // ok good
        System.out.println("Area = " + c);
        System.out.println("Perimeter = " + d);
    }
}