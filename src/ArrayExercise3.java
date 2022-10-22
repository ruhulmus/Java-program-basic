import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your number : ");
//        int num = input.nextInt();

        // Please enter your number : 3
        // 3 Occurs 1 times

        int[] numbers = {1,2,4,5,7,9,-2,3};

//        int count = 0;
//        for(int i = 0; i<numbers.length;i++){
//
//            if(numbers[i]==num){
//                count ++;
//            }
//        }
//        System.out.print(num + " Occurs "+ count + " times");


        //=====================

//        int min = numbers[0];
//        int max = numbers[0];
//
//        for(int i=0; i < numbers.length; i++) {
//            max = (max < numbers[i]) ? numbers[i] : max;
//            min = (min > numbers[i]) ? numbers[i] : min;
//        }
//        System.out.print("Max : " + max + " , Min "+min);

        //========================================

        int[] temp= new int[numbers.length];
        int j = 0;
        int k = numbers.length-1;
        for(int i=0;i<numbers.length;i++){

            if((numbers[i] % 2) != 0 ){
                temp[j++] = numbers[i];
//                System.out.println(num[i] +" "+numbers[i]);
            }
            else
                temp[k--]=numbers[i];
        }
        System.out.print(Arrays.toString(temp));
    }
}
