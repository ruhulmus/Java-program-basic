// Diamond Shape Star Pattern
public class StarPattern7 {
    public static void main(String[] args) {
        int i,j,k, row = 5;

        for (i=1;i<=row;i++){

            for(j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=row-1;i>=1;i--){

            for(j=i;j<row;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// output

