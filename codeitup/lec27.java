import java.io.*;

/**
 * lec26
 */
public class lec27 {

    public static void main(String[] args) throws IOException {
        int add = 0;
        BufferedReader ha = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many natural no. you want to print: ");
        int n = Integer.parseInt(ha.readLine());
        int i = 1;
        while (i <= n) {
            add = add + i;
            i = i + 1;

        }
        System.out.println(add);
    }
}