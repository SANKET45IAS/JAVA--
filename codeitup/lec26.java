import java.io.*;

/**
 * lec26
 */
public class lec26 {

    public static void main(String[] args) throws IOException {
        BufferedReader ha = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many natural no. you want to print: ");
        int n = Integer.parseInt(ha.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }

    }
}