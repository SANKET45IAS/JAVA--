public class swastik {
    public static void main(String[] args) {
        int size = 7;
        int row = 1;
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {

                if (row == 1 && i == 1) {
                    if (size % j == 1 && j != 6) {
                        System.out.print(" " + " ");
                    } else {
                        System.out.print("*" + " ");
                    }

                }
                if (row == 2 && i == 2) {
                    if (size % j == 1 || j == 5 || j == 6 || j == 7) {
                        System.out.print(" " + " ");
                    } else {
                        System.out.print("*" + " ");
                    }
                }
                if (row == 3 && i == 3) {
                    if (size % j == 1 || j == 5 || j == 6 || j == 7) {
                        System.out.print(" " + " ");

                    } else {
                        System.out.print("*" + " ");
                    }
                }
                if (row == 4 && i == 4) {

                    System.out.print("*" + " ");

                }
                if (row == 5 && i == 5) {
                    if (size / j == 7 || j == 5 || j == 6 || size % j == 1) {
                        System.out.print(" " + " ");
                    } else {
                        System.out.print("*" + " ");
                    }
                }
                if (row == 6 && i == 6) {
                    if (size / j == 7 || j == 5 || j == 6 || size % j == 1) {
                        System.out.print(" " + " ");
                    } else {
                        System.out.print("*" + " ");
                    }
                }
                if (row == 7 && i == 7) {
                    if ((size % j == 1 && j != 6) || size % j == 0 || j == 4) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    }
                }

            }
            row++;

            System.out.println();

        }
    }
}
