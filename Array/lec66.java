import java.util.*;

/**
 * array
 */
public class lec66 {

    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter size");
        int size = ha.nextInt();
        int num[] = new int[size];
        int n = 1, sum = 0, pro = 1;
        int i = 0;
        while (i < num.length) {
            System.out.println("Enter " + n + " element :");
            num[i] = ha.nextInt();
            i++;
            n++;
        }
        for (int s = 0; s < num.length; s++) {
            sum = sum + num[s];
            pro = pro * num[s];
        }
        System.out.println("Sum = " + sum);
        System.out.println("product = " + pro);
    }
}
