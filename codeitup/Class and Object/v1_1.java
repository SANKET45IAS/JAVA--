import java.util.*;

public class v1_1 {
    int n;

    public void getdata(int i) {
        n = i;
        System.out.println("value of I now:" + i);
    }

    public int putdata() {

        int rev = 0;
        for (; n > 0; n = n / 10) {
            rev = rev * 10 + n % 10;
        }
        return rev;

    }

    public static void main(String[] args) {
        int val;
        v1_1 ha = new v1_1();
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter a no. to find it reverse:");
        int ro = sa.nextInt();
        int s = ro;

        ha.getdata(ro);
        val = ha.putdata();
        System.out.println("Reverse of " + s + " is:" + val);

    }
}