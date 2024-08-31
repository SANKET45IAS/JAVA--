/**
 * Test
 */
public class program {

    int length, width;

    void getdata(int x, int y) {
        length = x;
        width = y;
    }

    int rectArea() {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        int area1, area2;
        program ha = new program();
        ha.length = 10;
        ha.width = 5;
        area1 = ha.rectArea();
        System.out.println("Area 1: " + area1);

        program ro = new program();
        ro.getdata(3, 5);
        area2 = ro.rectArea();
        System.out.println("Area 2: " + area2);
    }
}
