import java.util.Scanner;

/**
 * lec6
 */
public class lec6 {

    int a, b;

    public lec6() {
        a = 0;
        b = 0;// default
    }

    public lec6(int x, int y) {
        a = x;
        b = y; // Paramertice
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        a = sc.nextInt();
        System.out.println("Enter the value of B");
        b = sc.nextInt();
    }

    public void show() {
        System.out.println("A + B =" + (a + b));
    }

    public static void main(String[] args) {
        lec6 ha = new lec6(5, 10);
        ha.show();
        ha.input();
        ha.show();

    }
}