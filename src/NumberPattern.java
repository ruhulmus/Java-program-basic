// Number Pattern
public class NumberPattern {
    public static void main(String[] args) {
        int i,j,k, row = 5;
        for (i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("====================");

        for (i=row;i>=1;i--){
            for (j = 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("====================");

        for (i=1;i<=row;i++){
            for(j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("====================");

        for(i=row;i>=1;i--){
            for(j=i;j<row;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("====================");

        for(i=1;i<=row;i++){
            for(j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k);
            }

            for(j=i-1;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println("====================");

        for(i=1;i<=row;i++){
            for(j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for(k=i;k>1;k--){
                System.out.print(k);
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("====================");

        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("====================");

        for(i=1;i<=row;i++){
            for(j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(k=i;k<=row;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(i=row-1;i>=1;i--){
            for(j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(k=i;k<=row;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
// output

