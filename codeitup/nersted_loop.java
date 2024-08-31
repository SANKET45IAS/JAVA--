
public class nersted_loop {

    public static void main(String[] args) {
        int i, j, k = 5;
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k + " ");

            }
            k--;
            System.out.println();
        }
    }
}
