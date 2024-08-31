import java.util.Scanner;
// * star_printing

//*//
public class star_printing6 {

    public static void main(String[] args) {
        int i, n, j, b;
        Scanner ha = new Scanner(System.in);
        System.out.print("Enter the no: of row :-");
        n = ha.nextInt();
        for (i = 1; i <= n; i++) {
            for (b = 1; b <= n - i; b++) {
                System.out.print(" ");

            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        n = n - 1;
        for (i = 1; i <= n; i++)

        {
            for (b = 1; b <= i; b++) {
                System.out.print(" ");

            }

            for (j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}