import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int first = input.nextInt();

        System.out.print("Please enter Second number : ");
        int second = input.nextInt();
//        boolean flag = true;

        for (int i = first; i<=second; i++){
            if (isPrime(i))
                System.out.print(" "+i);
        }

    }
    private static boolean isPrime(int value){
        boolean flag = true;
        for(int i = 2 ; i<=value/2; i++){
            if(value%i==0){
                flag = false;
            }
        }
        return flag;
    }
}
