import java.util.Scanner;
// * star_printing

//*//
public class trails {

    public static void main(String[] args) {
        int n, b;
        Scanner ha = new Scanner(System.in);
        System.out.print("Enter the no: of row :-");
        n = ha.nextInt();
        for (int i = 1; i <= n; i++) {
            for (b = 1; b <= n - i; b++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + b);
            }
            System.out.println();

        }

    }

}
