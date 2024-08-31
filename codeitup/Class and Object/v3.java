import java.util.*;

/**
 * v1
 */
public class v3 {
    int a;

    public void getdata() {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter A");
        a = ha.nextInt();
    }

    public void putdata() {

        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not prime number");
        }

    }

    public static void main(String[] args) {
        v3 ha = new v3();

        ha.getdata();
        ha.putdata();

    }

}