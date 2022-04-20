public class ForEach {
    public static void main(String[] args) {
        //declare and initialize and array
        int[] numbers = {5,6,2,4};

        int i=0;
        int sum = 0;
        //Fo reach
        for (int number : numbers){
            System.out.println("Number"+i+" "+ number);
            sum += number;
            i++;
        }
        int avg = sum/numbers.length;
        System.out.println("SUM " + sum);
        System.out.println("AVG " + avg);
    }
}
