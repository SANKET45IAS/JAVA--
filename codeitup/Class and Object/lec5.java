import java.util.*;

public class lec5 {

    int roll;
    String name;
    static String college = "Iter";

    public lec5(int x, String y) {
        roll = x;
        name = y;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll no.: " + roll + ", College name: " + college);
    }

    static void change() {
        college = "SOA";
    }

    public static void main(String[] args) {
        lec5 a = new lec5(62, "Sanket");

        lec5.change();
        a.display();

    }
}
