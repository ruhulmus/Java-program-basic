import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printOptions();
        int option = input.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        int num;
        switch (option){
            case 1:
                System.out.print("Enter your Value : ");
                num = input.nextInt();
                numbers.add(num);
                System.out.println(num + " Aded !!");
                takeInput();
                break;
            case 2:
                System.out.println("Enter your Value : ");
                num = input.nextInt();
                if(numbers.contains(num)){
                    numbers.remove(num);
                    System.out.println(num + " removed !");
                }
                else{
                    System.out.println(num + " not found !");
                }
                takeInput();
                break;
            case 3:
                Collections.sort(numbers);
                System.out.println(numbers);
                takeInput();
                break;
            case 4:
                System.out.print("Bye !!");
                break;
            default:
                System.out.println("Invalid input !!");
                takeInput();
        }
    }

    private static void takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your Choice : ");
        int num = input.nextInt();
    }

    private static void printOptions() {
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your Choice : ");
    }

}
