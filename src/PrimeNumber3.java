import java.util.Scanner;

public class PrimeNumber3 {
//    static void checkPrime(int num){
//
//        int i, count=0;
//        if (num == 0 | num == 1){
//            System.out.print("Not a Prime");
//        }else{
//            for (i=2; i<num;i++){
//                if(num%2 == 0){
//                    count ++;
//                    break;
//                }
//            }
//            if (count == 0){
//                System.out.print("Is a Prime");
//            }
//            else{
//                System.out.print("Not a Prime");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter a Number : ");
//
//        int num = input.nextInt();
//        checkPrime(num);
//    }


//Display prime number bwetween range

//    static void getPrime(int start, int end){
//        int i;
//        System.out.print("Prime numbers Between " + start +" and "+ end + " : ");
//        for (i=start;i<end;i++){
//            if (isPrime(i))
//                System.out.print(" " +i);
//        }
//    }
//
//    static boolean isPrime(int n){
//        if (n%2 == 0)
//            return false;
//        else
//            return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your start number : ");
//        int start = input.nextInt();
//
//        System.out.print("Enter your End number : ");
//        int end = input.nextInt();
//
//        getPrime(start, end);
//    }

    static void checkPrime(int n){
        int i, count=0;
        if(n==0 | n== 1){
            System.out.print("Not a Prime");
        }
        else{
            for(i=2; i <n; i++){
                if (n%i == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.print("Is a Prime");
            }else
                System.out.println("Not a Prime");
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        checkPrime(num);
     }
}
