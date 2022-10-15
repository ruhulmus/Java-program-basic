import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number : ");
        int num = input.nextInt();
        int min = num ,max = num;
        while(true){
            num = input.nextInt();
            if (num >=0){
                if (num >= max)
                    max = num;
                if (num <= min)
                    min = num;
            }
            else{
                System.out.println("max : "+ max + ", Min : "+ min);
                break;
            }

        }
    }
}
