import java.util.*;

public class string1 {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter Your Name:");
        name = ha.nextLine();
        String hobby = new String();
        System.out.println("Enter Your HOBBY:");
        hobby = ha.nextLine();
        System.out.println("Hello " + name + "," + hobby + " wow it's nice hobby");

    }

}