import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        while(true){
            System.out.print("Please enter you number : ");
            Integer value = input.nextInt();
            sum +=value;
            if (sum >= 100)
                 break;
        }
        System.out.print("Done");
    }
}
