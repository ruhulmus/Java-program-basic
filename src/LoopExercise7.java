import java.util.Scanner;

public class LoopExercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");

        String str = input.nextLine();

        for (int i=0; i<str.length(); i++){
            System.out.print(" "+str.charAt(i));
        }


    }
}
