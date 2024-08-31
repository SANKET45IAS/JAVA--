import java.util.*;

public class lec392 {

    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        int x = 0, y = 1, z = 0, n, term = 1;
        System.out.println("Enter fibonacci no:");
        n = ha.nextInt();
        while (term <= n) {
            System.out.print(z + ",");
            x = y;
            y = z;
            z = x + y;
            term++;

        }

    }
}