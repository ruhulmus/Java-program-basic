import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your number : ");
//        int num = input.nextInt();

        // Please enter your number : 3
        // 3 Occurs 1 times

        int[] numbers = {1,1,1,2,-3,4};

//        int count = 0;
//        for(int i = 0; i<numbers.length;i++){
//
//            if(numbers[i]==num){
//                count ++;
//            }
//        }
//        System.out.print(num + " Occurs "+ count + " times");


        //=====================

        int min = numbers[0];
        int max = numbers[0];

        for(int i=0; i < numbers.length; i++) {
            if (max <= numbers[i])
                max = numbers[i];
            if(min >= numbers[i])
                min = numbers[i];
        }
        System.out.print("Max : " + max + " , Min "+min);
    }
}
