package oop;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] myInt = {10,12,15,10};
        String[] myString = {"john", "robin", "hood", "biken"};

        System.out.println("Original numeric array :" + Arrays.toString(myInt));
        Arrays.sort(myInt);
        System.out.println("Sorted Array: " + Arrays.toString(myInt) );
    }
}
