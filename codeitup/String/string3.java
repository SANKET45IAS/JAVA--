import java.util.*;

/**
 * string1
 */
public class string3 {
    public static void main(String[] args) {
        int vol = 0, cons = 0;
        Scanner ha = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter Your Name:");
        name = ha.nextLine();
        String s = name.toLowerCase();
        System.out.println("Hello " + name);
        System.out.println("Your name is " + (name.length() - 1) + " Letter");

        for (int i = 0; i < name.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') { // Check if the character is not an empty space
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vol++;
                    System.out.println("vowel are:" + c + " ");
                } else {

                    cons++;
                    System.out.println("consonants are:" + c + " ");
                }

            }
        }

        System.out.println("Number of vowels: " + vol);
        System.out.println("Number of consonants: " + cons);
    }
}
