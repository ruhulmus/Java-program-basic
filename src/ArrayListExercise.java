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
                num = input.nextInt();
                numbers.add(num);
                System.out.print(num + "Aded !!");
                takeInput();
                break;
            case 2:
                num = input.nextInt();
                if(numbers.contains(num)){
                    numbers.remove(num);
                    System.out.print(num + " removed !");
                }
                else{
                    System.out.print(num + " not found !");
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
                System.out.print("Invalid input !!");
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
        System.out.println("Your Choice : ");
        int num = input.nextInt();
    }

    private static void printOptions() {
        System.out.print("1. Add");
        System.out.print("2. Remove");
        System.out.print("3. Display");
        System.out.print("4. Exit");
        System.out.println();
        System.out.print("Your Choice : ");
    }

}
