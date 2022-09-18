import java.util.Scanner;

public class LoopExercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");

        int num = input.nextInt();

        int sum = 0;
        int first = 1, second =1;
        System.out.print(first+" "+second+" ");
        for (int i = 2; i<num;i++){
            int feb = first + second;
            System.out.print(" "+feb);
            first = second;
            second = feb;


        }


    }
}
