import java.util.*;

class string4b {
    public static void main(String[] args) {
        int count = 1; // Initialize count to 0
        Scanner ha = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter Your Name:");
        name = ha.nextLine();
        System.out.println(name.length() - 1);
        for (int i = 0; i < name.length() - 1; i++) {
            char c = name.charAt(i);
            char d = name.charAt(i + 1);
            if (c == ' ' && d != ' ') {
                count++;
            }
        }
        System.out.println("Your name has " + count + "Words");
    }
}