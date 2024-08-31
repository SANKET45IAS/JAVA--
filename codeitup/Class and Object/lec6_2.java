import java.util.Scanner;

/**
 * lec6
 */
public class lec6_2 {

    int a, b;

    public lec6_2() {
        a = 0;
        b = 0;// default
    }

    public lec6_2(int x, int y) {
        a = x;
        b = y; // Paramertice
    }

    public void show() {
        System.out.println("A + B =" + (a + b));
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        m = sc.nextInt();
        System.out.println("Enter the value of B");
        n = sc.nextInt();
        lec6_2 sa = new lec6_2(m, n);
        sa.show();

    }
}