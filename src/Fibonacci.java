import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("How many Number you want : "); //10
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        int feb;
        System.out.print(first+" "+second);
        for(int i=3 ; i<=num;i++){
            feb = first + second;
            System.out.print(" "+feb);
            first = second;
            second =feb;
        }
    }
}
//input : 10
// Output : 0 1 1 2 3 5 8 13 21 34