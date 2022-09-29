import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        int temp = 0;
        if (num == 0 | num == 1){
            System.out.print(num + "Not a prime number");
        }
        else{
            for (int i=2; i<num; i++){
                if(num%i == 0){
                    temp ++;
                    System.out.print(" "+i + "  ");
                    break;
                }
            }
            if (temp == 0)
                System.out.print(num+" is a Prime number");
            else
                System.out.print(num + " Not a prime number");
        }

    }
}
