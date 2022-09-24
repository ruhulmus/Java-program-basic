public class LoopExercise9 {
    public static void main(String[] args) {
        String str = "test";

        int i , j = str.length()-1;
        boolean isPalindrop = true;
        for (i=0;i<j;i++,j--){
            if (str.charAt(i)==str.charAt(j))
                continue;
            isPalindrop = false;
            break;
        }
        System.out.print(isPalindrop?"palindrom":"not palindrom");
    }
}
