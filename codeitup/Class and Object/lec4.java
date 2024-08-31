import java.util.*;

public class lec4 {

    int roll;
    String name;
    static String college = "Iter";

    public lec4(int x, String y) {
        roll = x;
        name = y;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll no.: " + roll + ", College name: " + college);
    }

    public static void main(String[] args) {

        int i = 2;
        while (i > 0) {
            Scanner sa = new Scanner(System.in);
            System.out.println("Enter roll");
            int m = sa.nextInt();
            System.out.println("Enter name");
            sa.nextLine(); // Consume newline character
            String n = sa.nextLine();
            lec4 ha = new lec4(m, n);
            ha.display();
            i--;
        }
    }
}
