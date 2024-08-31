import java.util.*;

import javax.sound.midi.SysexMessage;

/**
 * lec36
 */
public class lec36 {

    public static void main(String[] args) {
        int factorial = 1;
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter no. to find factorial:");
        int n = ha.nextInt();
        while (n > 0) {
            factorial = factorial * n;
            n = n - 1;
        }
        System.out.println("Factorial =" + factorial);
    }
}