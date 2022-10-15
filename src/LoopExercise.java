import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number : ");
        int num = input.nextInt();
//        int min = num ,max = num;
//        if(num >=0){
//            while(true){
//                num = input.nextInt();
//                if (num < 0)
//                    break;
//                    max = num >= max ? num : max;
//                    min = num <= min ? num : min;
//                }
//
//                    System.out.println("max : "+ max + ", Min : "+ min);
//
//            }
//        else
//            System.out.println("invalid input");


        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
            System.out.println(num);
        }
        System.out.println("sum : "+ sum);
    }
}
