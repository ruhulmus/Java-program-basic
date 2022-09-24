public class LoopExercise9 {
    public static void main(String[] args) {
        String str = "teet";

        int i , j = str.length()-1;
        boolean isPalindrop = true;
        for (i=0;i<j;i++){
            if (str.charAt(i)==str.charAt(j))
                continue;
            isPalindrop = false;
            break;
            j--;
        }
        System.out.print(isPalindrop?"palindrom":"not palindrom");
    }
}
