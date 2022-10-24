import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(2,4);
        System.out.println(integers);
    }
}
