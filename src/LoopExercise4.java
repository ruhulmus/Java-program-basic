import java.util.Scanner;

public class LoopExercise4 {
//    static void getMaxMin(int num){
//        int i, temp = 0, max =0, min = 0;
//        if (num >= max){
//            max = num;
//            min = num;
//        }
//    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Number : " );


        int num = input.nextInt();
        int i, temp = 0, max =num, min = num;
        if(num>=0) {
            while (true) {
                num = input.nextInt();
                if (num >= 0) {
                    if (num >= max) {
                        max = num;
                    }
                    if (num <= max) {
                        max = num;
                    }
                } else {
                    System.out.print("Max : " + max + " and Min : " + min);
                    break;
                }
            }
        }else
            System.out.print("invalid number");
    }
}
