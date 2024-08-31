import java.util.*;

/**
 * array
 */
public class lec67 {

    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter size");
        int size = ha.nextInt();
        int num[] = new int[size];
        int n = 1, position = 0, key;
        int i = 0;
        while (i < num.length) {
            System.out.println("Enter " + n + " element :");
            num[i] = ha.nextInt();
            i++;
            n++;
        }
        System.out.println("Enter your searching no: ");
        key = ha.nextInt();
        int flag = 0; // Initialize flag to 0
        int mid;
        for (int s = 0; s < num.length && flag == 0; s++) {
            if (key == num[s]) {
                flag = 1;
                position = s + 1; // Change i to s
            }
        }
        System.out.println("Your searching no. is at position: " + position);
    }
}
