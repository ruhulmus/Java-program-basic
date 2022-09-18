import java.util.Scanner;

public class LoopExercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        int num = input.nextInt();

        int sum = 0;
        while(true){
            sum += num%10;
            num /=10;

            if (num == 0){
                break;
            }
        }
        System.out.println(sum );
    }
}
