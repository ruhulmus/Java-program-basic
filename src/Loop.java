import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Program to find the sum of natural numbers from 1 to 5.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number : ");

        int n = 5;
        int sum = 0;

        for (int i=1; i<=n; i++){
            sum += i;
        }
//        for (int i=n; i>=1; --i){
//            sum += i;
//        }
        System.out.println("Total " + sum);
    }
}
