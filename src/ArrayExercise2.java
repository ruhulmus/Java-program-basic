public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,5,7};

        int sum =0;
        int products = 0;
        int avarage = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.print("sum : "+sum);
    }
}
