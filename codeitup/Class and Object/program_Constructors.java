// constractor mean same class
/**
 * program_Constructors
 */
public class program_Constructors {

    int length, breath;

    program_Constructors(int x, int y) {
        length = x;
        breath = y;
    }

    int rectArea() {
        return (length * breath); // dar ni
    }

    public static void main(String[] args) {
        int s;
        program_Constructors ha = new program_Constructors(5, 10);
        s = ha.rectArea();
        System.out.println("Area of rectangle =" + s);
    }
}