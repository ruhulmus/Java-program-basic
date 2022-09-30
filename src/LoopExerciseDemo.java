import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Please enter first number : ");
            int first = input.nextInt();

            System.out.print("Please enter Second number : ");
            int second = input.nextInt();

            if(first >0 && second>0){
                for (int i = first; i<=second; i++){
                    if (isPrime(i))
                        System.out.print(" "+i);
                }
            }
            else{
                System.out.print("Only positive integer allowed");
            }


        }catch (Exception e){
            System.out.print("ONly integer number is allowed " + e);
        }


    }
    private static boolean isPrime(int value){
        boolean flag = true;
        for(int i = 2 ; i<=value/2; i++){
            if(value%i==0){
                flag = false;
            }
        }
        return flag;
    }
}
