import java.util.Scanner;

public class Lec40 {
    public static void main(String[] args) {
        int n, z, count = 0, digits, pro, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it's an Armstrong number or not:");
        n = sc.nextInt();
        z = n;

        while (z > 0) {
            count = count + 1;
            z = z / 10;
        }

        System.out.println("No. of digits: " + count);

        // Reset z to the original number
        z = n;
        while (z > 0) {
            digits = z % 10;
            pro = 1;

            // Calculate power of digits
            for (int i = 1; i <= count; i++) {
                pro *= digits;
            }

            sum += pro;
            z = z / 10;
        }

        System.out.println("Sum of digits raised to the power of count: " + sum);

        if (sum == n) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }

    }
}
