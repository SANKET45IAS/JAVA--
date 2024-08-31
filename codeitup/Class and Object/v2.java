import java.util.*;

public class v2 {
    int n;

    public void getdata(int i) {
        n = i;
        System.out.println("value of:" + i);
    }

    public void putdata() {
        int s = n;
        int rev = 0;
        for (; n > 0; n = n / 10) {
            rev = rev * 10 + n % 10;
        }
        System.out.println("Reverse of " + s + " is:" + rev);
    }

    public static void main(String[] args) {
        v2 ha = new v2();
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter a no. to find it reverse:");
        int ro = sa.nextInt();

        ha.getdata(ro);
        ha.putdata();

    }
}