import java.util.*;

public class lec34 {

    public static void main(String[] args) {
        int product = 1;
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = ha.nextInt();
        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        System.out.println("Product = " + product);
    }
}