/**
 * program3_default
 */
public class program3_default {
    int length, breath;

    void perimeter() {
        length = 0;
        breath = 0;
    }

    void perimeter(int x, int y) {
        length = x;
        breath = y;
    }

    int putdata() {
        int perimeter = 2 * (length + breath);
        return (perimeter);
    }

    public static void main(String[] args) {
        int a;
        program3_default ha = new program3_default();
        ha.perimeter(5, 10);
        a = ha.putdata();
        System.out.println("Perimeter = " + a);
        program3_default ro = new program3_default();
        ro.perimeter();
        a = ro.putdata();
        System.out.println("Perimeter of default = " + a);

    }

}