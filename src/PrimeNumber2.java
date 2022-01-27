import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] srg){
        int m,n,count=0;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();

        for (int i=m; i<=n;i++){
            for(int j=2; j<=i-1; j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
                System.out.println(i);
            }
            count = 0;
        }

    }
}
