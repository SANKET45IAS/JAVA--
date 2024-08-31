
import java.util.*;

class string5 {
    public static void main(String[] args) {

        Scanner ha = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter Your Name:");
        name = ha.nextLine();
        int flag = 0, i = 0, j = name.length() - 1;
        for (; i < j && flag == 0;) {
            char c = name.charAt(i);
            char d = name.charAt(j);
            if (c != d) {
                flag++;
            }
            i++;
            j--;

        }
        if (flag == 0) {
            System.out.println("It is an palindrome");
        } else {
            System.out.println("It not a pailndrome");
        }
    }
}