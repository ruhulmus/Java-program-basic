import java.util.Scanner;

public class LoopExercise5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int num = input.nextInt();
        int length = String.valueOf(num).length();
        int sum = 0;
        for(int i=0 ;i<length;i++){
            sum += num%10;
            System.out.println("sum " + sum);
            num = num/10;
            System.out.println("num " + num);
        }
        System.out.println(sum);
    }
}
