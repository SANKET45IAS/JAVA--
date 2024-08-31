import java.io.*;
class addnatural{
    public static void main(String[] args) throws IOException{
        int a,i,add=0;
        BufferedReader ha = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no:");
        a=Integer.parseInt(ha.readLine());
        for (i=1;i<=a;i=i+1)
        add=add+i;
        {
            System.out.println(add);


        }

        
    }
}