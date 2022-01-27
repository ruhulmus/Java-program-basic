import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i<num;i++){
            if (num%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.print("Its prime numbr");
        }
        else{
            System.out.print("not a rime numbe");

        }
    }
}
