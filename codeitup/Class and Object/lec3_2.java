import java.util.*;

public class lec3 {

    int n;

    void getdata() {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter no. to check prime or not");
        n = ha.nextInt();
    }

    void putdata() {
        int sanket = n;
        int c = 0;
        for (int i = 1; i <= sanket; i++) {
            if (sanket % i == 0) {
                c += 1;
            }
        }
        if (c == 2) {
            System.out.println("It is a prime");
        } else {
            System.out.println("Not prime");
        }

    }

    public static void main(String[] args) {
        lec3 ro = new lec3(); // Corrected the class instantiation to lec3
        ro.getdata();

        ro.putdata();

    }
}
