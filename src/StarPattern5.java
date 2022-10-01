// Pyramid Star Pattern 2
public class StarPattern5 {
    public static void main(String[] args) {
        int i,j,k, row = 5;

        for (i=1; i<=row; i++){
            for(j=1; j<=row-i;j++){
                System.out.print(" ");
            }
            for(k=1; k<=(2*i)-1;k++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
// output

