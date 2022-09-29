import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
       do{
           System.out.print("Please Enter a number : ");
           sum += input.nextInt();
       }while(sum <=100);
        System.out.print("Done");
    }
}
