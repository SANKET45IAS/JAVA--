import java.util.*;

public class lec1 {
    int a, b;

    void getdata() {
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter x");
        a = ha.nextInt();
        System.out.println("Enter y");
        b = ha.nextInt();
    }

    void putdata() {
        System.out.println("Addition =" + (a + b));
    }

    public static void main(String[] args) {
        lec1 ro = new lec1();
        ro.getdata();
        ro.putdata();
    }

}