
/**
 * productdigits
 */
import java.io.*;

public class productdigits {

    public static void main(String[] args) throws IOException {
        int a, b = 1;
        BufferedReader ha = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the digit and JAVA will find its product");
        a = Integer.parseInt(ha.readLine());
        int i = a;
        while (a > 0) {
            b = b * a % 10;
            a = a / 10;

        }
        System.out.println("Product=" + b);

    }
}