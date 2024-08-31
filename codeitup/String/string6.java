import java.util.*;

class string6 {
    public static void main(String[] args) {
        int count = 1; // Initialize count to 0
        Scanner ha = new Scanner(System.in);
        String nou = new String();
        String now = new String();
        System.out.println("Enter Your Name:");
        nou = ha.nextLine();
        System.out.println("Enter Name:");
        now = ha.nextLine();
        if (nou.equals(now)) {
            System.out.println("Both are the same string");
        } else {
            System.out.println("Both are not the same string");
        }

    }
}