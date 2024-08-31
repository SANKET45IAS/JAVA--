import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        int count = 0; // Initialize count to 0
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ') {
                count++;
            }
        }

        System.out.println("Your name has " + count + " characters");
    }
}
