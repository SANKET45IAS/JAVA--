import java.util.*;

public class Lec41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, pro = 1;
        System.out.println("Enter x:");
        x = sc.nextDouble();
        System.out.println("Enter y:");
        y = sc.nextDouble();
        for (; y > 0; y--) {
            pro = pro * x;
        }
        System.out.println(pro);
    }
}
