import java.util.*;

/**
 * array
 */
public class lec65 {

    public static void main(String[] args) {
        int num[] = new int[5];
        int n = 1, k;
        Scanner ha = new Scanner(System.in);
        int i = 0;
        while (i < num.length) {
            System.out.println("Enter " + n + " element :");
            num[i] = ha.nextInt();
            i++;
            n++;

        }
        for (k = 0; k < num.length; k++) {
            System.out.print(num[k]);

        }

    }
}