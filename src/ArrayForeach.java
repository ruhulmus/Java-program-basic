public class ArrayForeach {
    public static void main(String[] args) {
        int[] num = {1,3,4,5,3,6,3,5,7,8,23,45};
        int sum = 0;
        for (int i: num){
            sum = sum + i;
            System.out.print("values " + i );
        }
        System.out.println("Sum : " + sum );
    }
}