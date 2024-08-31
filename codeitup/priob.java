import java.util.*;

/**
 * practice
 */
public class priob {

    int n, count = 0, i = 1;

    void getdata() {
        Scanner ha = new Scanner(System.in);
        n = ha.nextInt();
    }

    void putdata() {
        while (i <= n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2)
            System.out.println("It is a prime");
        else
            System.out.println("It is not a prime");
    }

    public static void main(String[] args) {
        priob ahs = new priob();
        ahs.getdata();
        ahs.putdata();

    }

}