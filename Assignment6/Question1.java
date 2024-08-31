import java.util.*;

public class Question1 {
    int sol;

    public int add(int x, int y) {

        sol = x + y;

        return sol;
    }

    public static void main(String[] args) {
        Question1 ha = new Question1();
        Scanner sa = new Scanner(System.in);
        int x = sa.nextInt();
        int y = sa.nextInt();
        int sol = ha.add(x, y);
        System.out.println(sol);

    }

}
