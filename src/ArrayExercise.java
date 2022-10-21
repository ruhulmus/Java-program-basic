public class ArrayExercise {
    public static void main(String[] args) {

         int[] numbers = {2,3,4};
         change(numbers);
         printArray(numbers);
    }
    public static void change(int[] numers){
        numers[0]=1;
        numers[1]=5;
    }
    public static void printArray(int[] numers){
        for(int i =0; i<numers.length;i++){
            System.out.print(numers[i]+" ");
        }
    }
}

