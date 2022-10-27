public class ArrayExercise6 {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int position = 5;
        System.out.println(getValue(arr,position));
    }

    private static int getValue(int[] arr, int position) {
         for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[position-1]){
                return arr[i];
            }
        }



        return -1;
    }

}
