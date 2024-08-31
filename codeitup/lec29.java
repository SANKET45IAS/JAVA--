import java.io.*;

/**
 * lec26
 */
public class lec29 {

    public static void main(String[] args) throws IOException {
        int rev = 0;
        BufferedReader ha = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. you want to reverse: ");
        int n = Integer.parseInt(ha.readLine());
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);

    }
}