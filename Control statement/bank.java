import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        char gender;
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter you gender(m/f):");
        gender = ha.next().charAt(0);
        double Balance, a, b;
        System.out.println("Enter you balance:");
        Balance = ha.nextDouble();
        a = Balance * 0.05;
        b = Balance * 0.02;
        if (gender == 'f')
            if (Balance > 5000)
                System.out.println("you get bonus of 5% : your amount = " + (a + Balance));
            else
                System.out.println("you get bonus of 2% : your amount = " + (b + Balance));
        if (gender == 'm')
            System.out.println("you get bonus of 2% : your amount = " + (b + Balance));
        else
            System.out.println("Bakchodi maat kar lauda");

    }
}