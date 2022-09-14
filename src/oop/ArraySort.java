package oop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] arr = {10,-3,23,44,5,0,-0};
        System.out.println("Actual Array : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting Array Asc: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("After Sorting Array Desc : " + Arrays.toString(arr));
    }
}

