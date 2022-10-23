import java.util.Arrays;

public class ArrayExercise4 {
    public static void main(String[] args) {
        int[][] integers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int rowSum = 0;
        int colSum = 0;

        for(int i = 0; i<integers.length;i++){
//            System.out.println(integers[0][0]);
//            System.out.println(integers[0][1]);
//            System.out.println(integers[0][2]);
//
//
//            System.out.println(integers[1][0]);
//            System.out.println(integers[1][1]);
//            System.out.println(integers[1][2]);
//            System.out.println(integers[i].length);
//            System.out.println(integers[i]);
//            rowSum += integers[i];

            for(int j =0; j<integers.length;j++){
                System.out.print(integers[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(integers));
    }

}
