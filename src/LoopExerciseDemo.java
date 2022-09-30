import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        int i = 2;
        boolean flag = true;

        while(i<=num/2){
            if (num%i == 0){
                flag = false;
                break;
            }
            i++;
        }
        System.out.print(flag?"Prime number": "not a prime number");
    }
}
