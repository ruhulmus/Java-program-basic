import javax.swing.*;
import java.util.Scanner;

public class LoopExercise3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = input.nextInt();
        int i, sum=0,temp;

        for(i= 1;i<=num;i++){
//            System.out.print(" "+ i);
            if (num%i == 0){

                if (i < num){
                    sum += i;
                    System.out.print(" "+ i);
                }
            }

//            if (num <= sum/2){
//                if (num%i ==0){
//
//                }
//
//            }
        }
        System.out.print(" = "+ sum);
    }
}
