import java.util.Scanner;

class A {
    int a, b;

    public void take(int x, int y) {
        a = x;
        b = y; // Parametric
    }

    public void show() {
        System.out.println("A + B = " + (a + b));
    }
}

class B extends A {
    int c;

    public void give() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C");
        c = sc.nextInt();
    }

    public void display() {
        System.out.println("A + B + C = " + (a + b + c));
    }

}

public class lec7 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        m = sc.nextInt();
        System.out.println("Enter the value of B");
        n = sc.nextInt();
        B sa = new B();
        sa.take(m, n);
        sa.give();
        sa.display();
    }
}
