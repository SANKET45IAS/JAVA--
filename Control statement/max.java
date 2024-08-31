import java.io.*;

class max {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number:");
        b = Integer.parseInt(br.readLine());
        System.out.println("Enter Third Number:");
        c = Integer.parseInt(br.readLine());
        if (a > b && a > c)
            System.out.println("The greatest no. is =" + a);
        else if (b > a && b > c)
            System.out.println("The greatest no. is =" + b);
        else
            System.out.println("The greatest no. is =" + c);

    }

}