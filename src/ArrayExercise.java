import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] numbers = {5,3,4,1,4,2,0};
        Arrays.sort(numbers,2,7);
        System.out.print(Arrays.toString(numbers));
    }
}

