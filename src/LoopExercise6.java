import java.util.Scanner;

public class LoopExercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum = 0;
        for (int i=0; i<num;i++){
            sum += i;
            System.out.print(" "+sum);
        }

    }
}
