// Reverse Pyramid Star Pattern
public class StarPattern8 {
    public static void main(String[] args) {
        int i,j,k, row = 8;

        for (i=1;i<=row;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(k=i;j<=row;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
// output

