import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAscDesc {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(); //intializatiton and empty Array list
        number.add(10);
        number.add(25);
        number.add(18);
        number.add(3,20); //index 3(defined) and element 20
        System.out.println("Array List Size : " + number.size());
        System.out.println("Array List: " + number);

        System.out.println("Array List Values :");
        for (int x : number){
            System.out.println(" " + x);
        }


        Collections.sort(number);
        System.out.println("Sorted Array ASC :" + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("Sorted Array Desc:" + number);
    }
}