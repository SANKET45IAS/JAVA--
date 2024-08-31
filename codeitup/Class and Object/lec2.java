import java.util.*;

public class lec2 {

        int n;

        void getdata(int i) {
                n = i;
        }

        int putdata() {
                int temp = n;
                int rev = 0;
                while (temp > 0) {
                        rev = rev * 10 + temp % 10;
                        temp = temp / 10;
                }
                return rev;
        }

        public static void main(String[] args) {
                lec2 ro = new lec2();
                Scanner ha = new Scanner(System.in);
                System.out.println("Enter n");
                int m = ha.nextInt();
                ro.getdata(m);

                int show = ro.putdata();
                System.out.println("Reverse = " + show);
        }
}
