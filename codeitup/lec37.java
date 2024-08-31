/**
 * lec37
 */
public class lec37 {

    public static void main(String[] args) {
        int i, count, j;
        for (i = 1; i <= 100; i++) {
            count = 0; // Reset count for each iteration

            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
