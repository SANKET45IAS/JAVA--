import java.util.Scanner;

class findreversequestion {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner ha = new Scanner(System.in);
        System.out.println("Enter no that you want to reverse:");
        a = ha.nextInt();
        for (; a > 0; a = a / 10)
            b = (b * 10) + a % 10;
        {
            System.out.println("Reverse no = " + b);
        }

    }
}