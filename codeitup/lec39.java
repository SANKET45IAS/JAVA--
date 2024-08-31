import java.util.*;

public class lec39 {

    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        int x = 0, y = 1, z = 0, n;
        System.out.println("Enter fibonacci no:");
        n = ha.nextInt();
        while (z < n) {
            System.out.println(z);
            x = y;
            y = z;
            z = x + y;

        }

    }
}