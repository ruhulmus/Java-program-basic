import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] numers1 = {2,3,4,5,1,6,4,7};
        int[] numers2 = {2,3,4,5,1,6,4,7};
        int[] numers3 = {2,9,4,5,1,6,4,7};

        System.out.print(Arrays.equals(numers1,numers2));
    }
}
