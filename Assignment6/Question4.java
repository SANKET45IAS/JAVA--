public class Question4 {
    int year;

    public int days(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }

    public void putdata() {
        for (year = 2000; year <= 2024; year++) {
            System.out.println(year + " has " + days(year) + " Days");
        }
    }

    public static void main(String[] args) {
        Question4 ha = new Question4();
        ha.putdata();
    }
}
