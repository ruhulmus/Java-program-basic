import java.util.Arrays;
import java.util.*;
public class ArrayOperations4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8, 5};
        int position = 3;
        System.out.println("Old Array : "+ Arrays.toString(arr));
//        for(int i = 2 ; i < arr.length-1;i++){
//            arr[i-1]=arr[i];
//        }
        for(int i = arr.length-1; i>position-1;i--){
            arr[i-1]=arr[i];
        }
        System.out.println(Arrays.toString(arr));

        int[] nums = {2, 4, 1, 8, 5};
        int target = 3;

        int[] arr2 = new int[2];
        
        int[] test= getSum(nums, target);
        if(test ==null ){
            System.out.println("not found");
        }else
             System.out.println(Arrays.toString(test));

    }

//    private static int[] getSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//
//            for(int j=i+1; j<nums.length;j++){
//                if(nums[i]+nums[j] == target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return null;
//    }
    private static int[] getSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            int cur = nums[i];

            if (map.get(target-cur) != null) {
                System.out.println(map.get(target-cur)+" "+i);

                return new int[] {map.get(target-cur), i};
            }
//            map.put(cur, i);
        }
        return null;
    }



}
