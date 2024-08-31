import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class max {
    public static void main(String[] args) throws IOException {
        double a, b, ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter Second Number:");
        b = Double.parseDouble(br.readLine());
       
        System.out.println(
                "Enter your choice \n1->ADD \n2->SUBSTRACT \n3->MULTIPLICATION \n4->DIVIDE \n5->Root \nEnter your choice:");
        ch = Double.parseDouble(br.readLine());
        if (ch == 1)
            System.out.println("ADDITION = " + (a + b));
        else if (ch == 2)
            System.out.println("SUBSTRACTION = " + (a - b));
        else if (ch == 3)
            System.out.println("MULTIPLICATION = " + (a * b));
        else if (ch == 4)
            System.out.println("DIVISION = " + (a % b));
        else if (ch == 5)
            System.out.println("ROOT =" + Math.pow(a, b));
        else
            System.out.println("Invalid choice:");

    }
}