import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements ? : " );
        int n = input.nextInt();

        if(n<=20 || 2>=1){
            int[] numbers = new int[n];

            for(int i=0;i<n;i++){
                int num = input.nextInt();
                numbers[i]=num;
            }

            System.out.print(Arrays.toString(numbers));
        }

    }

    private static void fillArray(int[] number) {

    }
}
