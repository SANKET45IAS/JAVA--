
/**
 * checkprime
 */
import java.util.*;

public class checkprime {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        int a, count = 0;
        System.out.println("Enter your digits");
        a = ha.nextInt();
        int i = 1000;// initialization
        while (i <= a) {
            if (i % 2 == 0)
                count = count + 1;
            i = i + 1;

        }
        System.out.println(count);

    }

}