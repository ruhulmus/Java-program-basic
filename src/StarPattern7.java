// Diamond Shape Star Pattern
public class StarPattern7 {
    public static void main(String[] args) {
        int i,j,k, row = 8;

        for (i=1;i<=row;i++){
            for(j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for (k=1 ; k<=i; k++){
                System.out.print("*");
            }
            for (k=1 ; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// output

