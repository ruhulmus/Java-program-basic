import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        int count = 0;

//
//         for (int i =0; i<= t.length()-1;i++){
//             System.out.println("Contains : "+s.contains(String.valueOf(t.charAt(i))));
//
//             if(!s.contains(String.valueOf(t.charAt(i)))){
//                count++;
//            }
//        }
//        if(count == 0)
//            System.out.println("Yes");
//        else
//            System.out.println("no");




        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("arr1 "+ Arrays.toString(arr1));
        System.out.println("arr2 "+ Arrays.toString(arr2));

        if(Arrays.equals(arr1, arr2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }




    }
}
