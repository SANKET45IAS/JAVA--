import java.util.*;

class Calculator {
    public static void main(String[] args) {
        while (true) {
            int a, b, result = 0; // Initialize result with a default value
            Scanner br = new Scanner(System.in);

            System.out.print("Enter two operands : ");
            a = br.nextInt();

            b = br.nextInt();

            System.out.println("Enter your choice:");
            int choice = br.nextInt();

            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("ADDITION = " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("SUBTRACTION = " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("MULTIPLICATION = " + result);
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b; // Use regular division here
                        System.out.println("DIVISION = " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 5:
                    result = (int) Math.pow(a, b); // Cast the result to int for power operation
                    System.out.println("POWER = " + result);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
