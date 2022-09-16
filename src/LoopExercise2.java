import java.util.Scanner;

public class LoopExercise2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i;

        // Using Foor loop
        for (i = 0; i<=100 ; i++){
            System.out.print("Enter a number : ");
            sum += input.nextInt();
            if (sum >= 100){
                System.out.print("Exceeds 100");
                break;
            }
        }


    }
}
