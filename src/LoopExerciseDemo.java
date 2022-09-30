import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();

        int num = n;
        int count = 0;
//        System.out.println(num/10);
        while(true){
            if(num%10 == 0){
                break;
            }
            count +=num%10;
            num = num/10;
        }
        System.out.print(count);
    }
}
