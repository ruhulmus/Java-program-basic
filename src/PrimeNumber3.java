import java.util.Scanner;

public class PrimeNumber3 {
    static void checkPrime(int num){

        int i, count=0;
        if (num == 0 | num == 1){
            System.out.print("Not a Prime");
        }else{
            for (i=2; i<num;i++){
                if(num%i == 0){
                    count ++;
                    break;
                }
            }
            if (count == 0){
                System.out.print("Is a Prime");
            }
            else{
                System.out.print("Not a Prime");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");

        int num = input.nextInt();
        checkPrime(num);
    }
}
