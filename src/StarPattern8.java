// Reverse Pyramid Star Pattern
public class StarPattern8 {
    public static void main(String[] args) {
        int i,j,k, row = 5;

        for (i=1;i<=row;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(k=i;j<=row;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("=====================");

        for(i=row; i>=1; i--){
            for(j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// output

