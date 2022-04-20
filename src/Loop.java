import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");

        int n = 5;
        int sum = 0;

        for (int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println("Total " + sum);
    }
}
