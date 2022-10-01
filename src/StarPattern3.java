// Left Triangle Star Pattern
public class StarPattern3 {
    public static void main(String[] args) {
        int i,j,k, row = 5;

        for (i=0; i<=row; i++){
            for(j=row-1; j>=i;j--){
                System.out.print(" ");
            }
            for(k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
// output

