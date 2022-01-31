import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Digits : ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;

        while (temp !=0) {
            int val = temp % 10;
            temp = temp / 10;
            sum = sum + val * val * val;
        }
        if(num == sum)
            System.out.println(num +" is ArmStrong");
        else
            System.out.println(num +" is not ArmStrong");
    }
}
