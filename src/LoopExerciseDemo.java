import java.util.Scanner;

public class LoopExerciseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        String n = input.nextLine();
        String value = n;
        String reverse = "";

        for (int i = n.length()-1; i >=0 ; i--){
            reverse += n.charAt(i);
//            System.out.print(reverse+" ");
        }
//        System.out.print(reverse);
        if(n.equals(reverse))
            System.out.print("Palindrom");
        else
            System.out.print("Not a palindrom");
//        while(num !=0 ){
//            int reminder = num%10;
//            reverse = reverse * 10 + reminder;
//            System.out.print( reverse+" ");
//            num /=10;
//        }
//         if( n == reverse)
//            System.out.print( "Palindrom");
//        else
//            System.out.print("Not a palindrom");
    }

}
