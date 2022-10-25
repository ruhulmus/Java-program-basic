import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperations {
    public static void main(String[] args) {

        int[] numbers = {2,6,4,7,3};

         System.out.println("Initial Array is : "+ Arrays.toString(numbers));


        int size = numbers.length;
        numbers[0]=10;
        numbers[size-1]=7;
        System.out.print("Update Array is : "+ Arrays.toString(numbers));


        System.out.println();
        System.out.println("---------Array List---------");

//        ArrayList<Integer> num = new ArrayList<>();

        List num = new ArrayList<>(Arrays.asList(numbers));

//        num.add(2);
//        num.add(6);
//        num.add(4);
//        num.add(7);
//        num.add(3);
        System.out.println("Original Array List is : "+ num);

        num.add(0,3);
        System.out.println("Updated Array List is after Adding : "+ num);

        num.set(2,10);
        num.set(1,55);
        System.out.println("Updated Array List is after Update : "+ num);

        num.remove(3);
        System.out.println("Updated Array List is after Delete : "+ num);

    }
}
