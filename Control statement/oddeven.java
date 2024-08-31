import java.io.*;
class oddeven{
    public static void main(String[]args)throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number:");
        a=Integer.parseInt(br.readLine());
        if (a%2==0)
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");

    }
}