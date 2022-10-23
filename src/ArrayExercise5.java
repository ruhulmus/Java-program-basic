public class ArrayExercise5 {
    public static void main(String[] args) {
        int[][] integers = {
                {1,10,3,8},
                {9,12,6,7},
                {5,2,11,4}
        };

        for(int i = 0; i < integers.length;i++){

            int max = integers[0][0];

            for(int j=0;j<integers[i].length;j++){
                max = (integers[i][j])>max ? integers[i][j]: max;
            }
            System.out.print("MAx of Row "+(i+1)+" : "+ max);
            System.out.println();
        }
    }
}
