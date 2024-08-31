import java.util.*;

public class ado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter nos.");
            int n = sc.nextInt();
            a[i] = n;
        }

        eliminatesduplicate(a);
        System.out.println(a);
    }

    public static int eliminatesduplicate(int[] list) {
        System.out.println("enter position");
        int pos = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] = a[j]) {
                    for (int k = pos; k < 10; k++) {
                        a[k] = a[k + 1];
                        n--;
                    }
                }
            }
            return (a[k]);
        }
    }
}
