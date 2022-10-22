public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,5,7};

        int sum =0;
        int products = 1;

        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
            products *= numbers[i];
        }
        double avarage = (double) sum / numbers.length;
        System.out.println("sum : "+sum);
        System.out.println("Avarage : "+ avarage);
        System.out.println("products : "+ products);
    }
}
