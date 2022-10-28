import java.util.Arrays;

public class ArrayOperations3 {
    // Given array =v   [2, 4, 1, 8, 5] ;
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]=2;
        arr[1]=4;
        arr[2]=1;
        arr[3]=8;
        arr[4]=5;

       int position  = 4;
       int value = 10;

       System.out.println("Existing Array :"+ Arrays.toString(arr));
       for(int i = arr.length-1;i>=position;i-- ){
            arr[i]= arr[i-1];
       }
       arr[position-1] = value;

       System.out.print("Update Array : "+ Arrays.toString(arr));
    }


}
