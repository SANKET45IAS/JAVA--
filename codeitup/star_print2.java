import java.util.Scanner;
// * star_printing

//*//
public class star_print2 {

    public static void main(String[] args) {
        int n, j, k = 1;
        Scanner ha = new Scanner(System.in);
        System.out.print("Enter the no: of row :-");
        n = ha.nextInt();
        for (int i = 1; i <= n; n--) {
            for (j = 1; j <= n; j++) {
                System.out.print(k + " " + 'b');
                k++;
            }

            System.out.println();
        }
    }
}