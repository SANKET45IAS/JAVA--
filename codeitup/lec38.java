import java.util.*;

public class lec38 {

    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter which digit table you want to print:");
        int n = ha.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + (n * j));
        }

    }
}
