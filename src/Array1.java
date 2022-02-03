import java.util.Scanner;

public class Array1 {
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
        System.out.print("Avarage number is : " + avg );
    }
}
// input : Take 5 input numbers from users
// Output : make sum and avarage of these numbers
