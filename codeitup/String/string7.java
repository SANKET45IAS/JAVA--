import java.util.*;

class string7 {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        String nou, now;

        System.out.println("Enter Name:");
        nou = ha.nextLine();
        char charvalue = nou.charAt(0);
        System.out.println(charvalue);

        System.out.println("Enter Second Name:");
        now = ha.nextLine();
        char charvalu = now.charAt(0);
        System.out.println(charvalu);

        if (nou.compareTo(now) == 0) {
            System.out.println("Both are the same string");
        } else if (nou.compareTo(now) < 0) {
            System.out.println("Second name greater than first");
        } else {
            System.out.println("First name is greater than second no.");
        }
    }
}
