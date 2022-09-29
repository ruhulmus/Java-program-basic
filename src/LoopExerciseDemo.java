import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        int i, sum = 0;

        for(i = 1; i<= num/2;i++){
            if(num%i == 0)
                sum+=i;
        }
        System.out.print(sum);
    }
}
