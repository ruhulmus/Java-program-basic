import java.util.Scanner;

public class LoopExercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");

        int num = input.nextInt();
        int feb = 0;
        int first = 0, second = 1;
        for (int i=1; i<num;i++){
             feb = first+second;
             System.out.print(" tt "+feb);
             first = feb;
        }

    }
}
