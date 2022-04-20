public class ForEach {
    public static void main(String[] args) {
        // Create array
        int[] numbers = {5,6,2,4};

        int i=0;
        int sum = 0;
        //Fo reach
        for (int number : numbers){
            System.out.println("Number"+i+" "+ number);
            sum += number;
            i++;
        }
        System.out.println("Total " + sum);
    }
}
