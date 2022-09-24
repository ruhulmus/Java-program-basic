public class LoopExercise8 {
    public static void main(String[] args) {
        String str = "test text";

        for (int i= str.length()-1; i>=0 ; i--)
            System.out.print(str.charAt(i));
    }
}
