import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        boolean flag = true;

        for (int i=2; num/2; i++){
            if (num%i ==0 ){
                flag = false;
            }

        }
//        System.out.print(flag ? "Prime number" : "Not a prime number");
    }
}
