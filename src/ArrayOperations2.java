import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=10;
        arr[1]=15;
        arr[2]=30;
        arr[3]=4;
        arr[4]=13;

        int value = 26;

        System.out.println(arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr.length);
            if(i== arr.length-1)
                arr[i]=value;

        }
        System.out.println(Arrays.toString(arr));
    }
}
