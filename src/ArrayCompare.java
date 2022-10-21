import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] numers1 = {2,3,4,5,1,6,4,7};
        int[] numers2 = {2,3,4,5,1,6,4,7};
        int[] numers3 = {2,9,4,5,1,6,4,7};

        String [] str1 = {"test","test1","test3"};
        String [] str2 = {"test","test1","test3"};
        System.out.print(str1 == str2);
        System.out.print(Arrays.equals(str1,str2));
    }
}
