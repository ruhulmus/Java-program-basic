import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your numbers : ");
        int num1 = input.nextInt();

        ArrayList<Integer> items = new ArrayList<>();

        for(int i=0; i<num1;i++){
            int num = input.nextInt();
//            checkExist(items, num);
            if(!items.contains(num))
                items.add(num);
        }
        Collections.sort(items);
        System.out.print(items);

    }
}
