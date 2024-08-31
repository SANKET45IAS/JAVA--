import java.util.Scanner;
// * star_printing

//*//
public class star_printing {

    public static void main(String[] args) {
        int i, j;
        for (i = 65; i <= 69; i = i + 1) {
            for (j = 65; j <= i; j = j + 1) {
                System.out.print((char) j + " ");

            }

            System.out.println(" ");
        }

    }
}