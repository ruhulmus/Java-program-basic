import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int n = input.nextInt();
//        String str = input.nextLine();
//
//        String result = "";
//        for (int i = str.length()-1 ; i >= 0 ; i-- ){
//            result += str.charAt(i);
//
//        }
//        System.out.print(result);


//        for(int i=1;i<=n;i++){
//            for(int j= n-1; j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k = 1 ; k <=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i=1; i<=n;i++){
//            for(int j=1;j<=n-1;j++){
//                System.out.print(" ");
//            }
            for(int j= n-1; j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1 ;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
