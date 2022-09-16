import java.util.Scanner;

public class LoopExercize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number1 : ");
        int num = input.nextInt();

        System.out.println("numbers : ");
        for (int i=2; i <= num ; i+=2){
            System.out.print(" "+ i);
        }

    }
}
