public class Array2D {
    public static void main(String[] args) {
        int[][] num = new int[2][4];

        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 40;
        num[0][3] = 13;
        num[1][0] = 14;
        num[1][1] = 50;
        num[1][2] = 40;
        num[1][3] = 40;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(" " + num[row][col]);
            }
            System.out.println();
        }
    }
}

/* Output
    10 20 40 13
    14 50 40 40
 */