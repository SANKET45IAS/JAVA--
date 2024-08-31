import java.util.Scanner;

class addscanner {
    public static void main(String[] args) {
        Float Length, Breath, area, Perimetre;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length:");
        Length = sc.nextFloat();

        System.out.println("Enter Breath:");
        Breath = sc.nextFloat();
        area = Length * Breath;
        Perimetre = 2 * (Length + Breath);
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimetre of Rectangle = " + Perimetre);
        System.out.println('b' + 'c');

    }
}
