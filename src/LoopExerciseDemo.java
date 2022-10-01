import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String n = input.nextLine();

        String reverse = "";

        for (int i = n.length()-1 ; i >=0 ; i--){
            reverse += n.charAt(i);
        }
        System.out.print(reverse);
    }

}
