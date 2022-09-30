import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int max = n, min = n;

        if(n>=0){
            while(true){
                 n = input.nextInt();

                if(n<0)
                    break;
                max = n > max ? n : max;
                min = n < min ? n : min;
            }
            System.out.print("Max " + max +", Min "+ min);
        }
        else{
            System.out.print("invalid");
        }




    }
}
