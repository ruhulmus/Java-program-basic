import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayOptions();
        ArrayList<Integer> numbers = new ArrayList<>();


        while(true){

            int options = input.nextInt();
            if(options == 1){
                System.out.print("Enter your value for Add : ");
                int item = input.nextInt();
                addItem(numbers, item);
                displayOptions();
            }
            if(options == 2){
                System.out.print("Enter your value for remove : ");
                int item = input.nextInt();
                removeItem(numbers,item);
                displayOptions();
            }
            if(options == 3){
                displayItems(numbers);
                displayOptions();
            }
            if(options == 4){
                System.out.println("Bye !");
                break;
            }
//            switch (options){
//                case 1:
//                    System.out.print("Enter your value for Add : ");
//                    int item = input.nextInt();
//                    addItem(numbers, item);
//                    displayOptions();
//                case 2:
//                    System.out.print("Enter your value for remove : ");
//                    item = input.nextInt();
//                    removeItem(numbers,item);
//                    displayOptions();
//                case 3:
//                    displayItems(numbers);
//                    displayOptions();
//                case 4:
//                    System.out.println("Bye !");
//                    break;
//                default:
//                    System.out.println("invalid input");
//            }
        }
    }

    private static void displayItems(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    private static void removeItem(ArrayList<Integer> numbers, int item) {
        if(numbers.contains(item)){
            System.out.println("yes");
            numbers.remove(Integer.valueOf(item));
            System.out.println("Remove !");
        }
        else{
            System.out.println("Not Found");
        }

    }

    private static void addItem(ArrayList<Integer> numbers, int item) {
        numbers.add(item);
        System.out.println("Added !");
    }

    private static void displayOptions() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Enter your Choice : ");
    }
}