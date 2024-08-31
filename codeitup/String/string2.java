import java.util.*;

/**
 * string1
 */
public class string2 {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter Your Name:");
        name = ha.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Length: " + name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i + ":" + name.charAt(i) + " ");
        }

    }

}