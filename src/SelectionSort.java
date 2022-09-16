import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,4,-10,5,32,45};

        int i, j,min_idx, temp,n;

        n = arr.length;
        for (i = 0; i<n-1;i++){
            min_idx = i;

            for (j=i+1; j< n ; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i]=temp;
        }
        System.out.println("Array : " + Arrays.toString(arr));

    }
}
