public class LeedCodeExercise {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        String I = "1";
        String V = "5";
        String X = "10";
        String L = "50";
        String C = "100";
        String D = "500";
        String M = "1000";


        // IV = 4
        // IX = 9
        // XL = 50
        // XC = 90
        // CD = 400
        // CM = 900

        int result = 0;
        int num=0; int ans = 0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L':  num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M':  num = 1000; break;
            }

//            int number = Integer.parseInt(String.valueOf(s.charAt(i)));

            result += num;
//            System.out.print(number);
        }

        System.out.print(result);

    }
}
