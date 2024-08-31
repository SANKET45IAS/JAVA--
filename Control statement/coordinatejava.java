import java.util.*;

public class coordinatejava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate:");
        double x = sc.nextDouble();
        System.out.println("Enter y coordinate");
        double y = sc.nextDouble();
        if (x == 0) {
            System.out.println("(" + x + "," + y + ")" + "lies on y axis");

        } else if (y == 0) {
            System.out.println("(" + x + "," + y + ")" + "lies on x axis");
        } else if (x < 0 && y < 0) {
            System.out.println("is in quadrant III");
        } else if (x > 0 && y > 0) {
            System.out.println("is in quadrant I");
        } else if (x > 0 && y < 0) {
            System.out.println("is in quadrant IV");
        } else if (x < 0 && y > 0) {
            System.out.println("is in quadrant II");
        } else {
            System.out.println("Bakchodi maat kar lawuda🙋‍♂️👋");
        }

    }

}
