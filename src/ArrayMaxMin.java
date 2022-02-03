import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] number = new Double[5];
        double sum =0;
        System.out.println("Please Enter your 5 numbers : ");
        for (int i=0 ; i<number.length;i++){
            number[i] = input.nextDouble();
        }
        for (int i=0 ; i<number.length;i++){
            sum = sum + number[i];
        }
        double avg = sum/number.length;
        System.out.println("Total Sum of numbers : " + sum );
        System.out.println("Avarage number is : " + avg );

        double max = number[0];
        double min = number[0];
        for (int i=1; i<number.length;i++){
            if (max < number[i]){
                max = number[i];
            }
            if (min > number[i]){
                min = number[i];
            }
        }
        System.out.println("Max number is : " + max );
        System.out.println("Min number is : " + min );
    }
}
// input : Take 5 input numbers from users
// Output : Print max and Min from these numbers
