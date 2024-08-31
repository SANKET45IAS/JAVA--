import java.util.*;

/**
 * v1
 */
public class v1 {
    int a, b;

    public void getdata() {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter A");
        a = ha.nextInt();
        System.out.println("Enter B");
        b = ha.nextInt();
    }

    public void putdata() {
        System.out.println("Addition" + (a + b));
    }

    public static void main(String[] args) {
        v1 ha = new v1();

        ha.getdata();
        ha.putdata();

    }

}