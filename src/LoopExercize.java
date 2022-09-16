import java.util.Scanner;

public class LoopExercize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your number : ");
        int num = input.nextInt();
        int i;

        System.out.println("numbers : ");
//        for (i=1; i <= num ; i++){
//            System.out.print(" "+ i);
//        }
        //Output 2 4 6 8 10 --- n
//        for (i=2; i <= num ; i+=2){
//            System.out.print(" "+ i);
//        }

       //Output  100 99 98 97 96 ... 2
//        for ( i = num; i > 1; i--){
//            System.out.print(" "+ i);
//        }

        //Output 100 98 96 94 92 .. n
        for ( i = num; i > 1; i-=2){
            System.out.print(" "+ i);
        }

        for ( i = num; i >= 1; i--){
            if(i%2 !=0)
            System.out.print(" "+ i);
        }


    }
}
