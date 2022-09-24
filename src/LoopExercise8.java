import java.util.Scanner;

public class LoopExercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text : ");

        String str = input.nextLine();

        String reverse = "";

        for (int i= str.length()-1; i>=0 ; i--)
            reverse +=str.charAt(i);
        System.out.print(reverse);

    }
}
