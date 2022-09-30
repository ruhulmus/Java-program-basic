import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int first = 1;
        int second = 1;
        int count;
        System.out.print(first+" "+ second);
        for (int i = 2 ; i < n; i++){
            count = first + second;
            first = second;
            second = count;
            System.out.print(" "+ count);
        }

    }
}
