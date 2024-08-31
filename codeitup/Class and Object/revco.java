import java.util.*;

public class revco {

    int n, rev;

    void getdata(int i) {
        n = i;
    }

    int putdata() {
        rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10; // Fix the while loop condition
        }
        return (rev);
    }

    public static void main(String[] args) {
        int m, val;
        revco ha = new revco();
        Scanner ahs = new Scanner(System.in);
        System.out.println("Enter number to find reverse");
        m = ahs.nextInt();
        ha.getdata(m);
        val = ha.putdata();
        System.out.println(val);
    }
}
