import java.io.*;

/**
 * lec26
 */
public class lec32 {

    public static void main(String[] args) throws IOException {
        int sum = 0, product = 1, digit;
        BufferedReader ha = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the the digit: ");
        int n = Integer.parseInt(ha.readLine());
        while (n > 0) {
            digit = n % 10;
            if (digit % 2 == 0)
                product = product * digit;
            else
                sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of odd no. in the digits = " + sum + "\nproduct of even no. in the digit = " + product);
    }

}
