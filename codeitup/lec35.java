import java.util.*;

public class lec35 {

    public static void main(String[] args) {
        int count = 0, i;
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter no. to find it's prime or not:");
        int n = ha.nextInt();
        i = 1;
        while (i <= n) {
            if (n % i == 0)
                count = count + 1;
            i = i + 1;
        }
        if (count == 2)
            System.out.println(n + " is a Prime number");
        else
            System.out.println(n + " is nota prime number");
    }
}