import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(5);
//        integers.add(2,4);
//        for(Integer num : integers){
//            System.out.print(num+" ");
//        }
//        System.out.println(integers);

        int[] arr= {5,2,2,0};
        int count =0;
        for(Integer item:arr){
            System.out.print(item+" "+count);
            count++;
            System.out.println();
        }

    }
}
