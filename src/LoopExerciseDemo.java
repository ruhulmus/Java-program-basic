import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String n = input.nextLine();

        for (int i = 0; i <n.length() -1; i++){
            System.out.print(n.charAt(i)+" ");
        }

    }

}
