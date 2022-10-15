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


//        int sum = 0;
//        while(num > 0){
//            sum += num%10;
//            num = num/10;
//            System.out.println(num);
//        }
//        System.out.println("sum : "+ sum);

        int first_num = 1, secont_num = 1;
        System.out.print(first_num + ", " + secont_num);
        for (int i = 2; i<num; i++){
            int n = first_num + secont_num;
            System.out.print(",  "+n);
            first_num = secont_num;
            secont_num = n;
        }


    }
}
