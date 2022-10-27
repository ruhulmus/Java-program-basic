public class ArrayExercise6 {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 10, 6, 40 };
        int position = 5;
        int value = 10;
        System.out.println();
        int val = findValue(arr,position);
        if(val==-1)
            System.out.println("not found !!");
        else
            System.out.println(val);
    }

    private static int findValue(int[] arr, int position) {
         for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[position-1]){
                return arr[i];
            }
        }
        return -1;
    }

}
