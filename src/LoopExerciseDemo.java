import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        int count = 0;

        if (num == 0 | num ==1){
            System.out.print(num+" Not a Prime number");
        }
        else{
            for(int i=2; i<num;i++){
                if(num%i == 0){
                    count ++;
                    break;
                }

            }
            if(count == 0){
                System.out.print(num + " Is Prime number");
            }
            else{
                System.out.print(num+" Not a Prime number");
            }
        }


    }
}
