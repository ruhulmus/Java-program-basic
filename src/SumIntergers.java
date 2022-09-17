public class SumIntergers {

    public static int getSum(int a, int b) {
        for(int i=1;i<=b;i++){
            a++;
        }
        return a;
    }
    public static void main(String args[]){
        int a = getSum(2, -3);
        System.out.print(a);
    }
}
