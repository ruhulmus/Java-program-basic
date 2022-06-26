package oop;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] myInt = {10,12,15,10};
        String[] myString = {"john", "robin", "hood", "biken"};

        System.out.println("Original numeric array :" + Arrays.toString(myInt));
        Arrays.sort(myInt);
        System.out.println("Sorted Array: " + Arrays.toString(myInt) );


        int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("i : "+ i);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("j : "+ j);
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    System.out.println("arr[i] : "+ arr[i]);
                    System.out.println("arr[j] : "+ arr[j]);
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
