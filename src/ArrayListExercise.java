import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printOptions();


        ArrayList<Integer> numbers = new ArrayList<>();
        int num;

        while (true){
            takeInput();
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Enter your Value : ");
                    num = input.nextInt();
                    addItem(numbers,num);
                    System.out.println();
                    takeInput();
                    break;
                case 2:
                    System.out.println("Enter your Value : ");

                    num = input.nextInt();
                    removeItem(numbers,num);
                    takeInput();
                    break;
                case 3:
                    displayItem(numbers);
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


    }
    public static void addItem(ArrayList<Integer> numbers, int item){
        numbers.add(item);
        System.out.println(item + " Aded !!");
    }
    public static void removeItem(ArrayList<Integer> numbers, int item){
        if(numbers.contains(item)){
            numbers.remove(item);
            System.out.println(item + " removed !");
        }
        else{
            System.out.println(item + " not found !");
            System.out.println();
        }
    }
    public static void displayItem(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        System.out.println(numbers);
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
