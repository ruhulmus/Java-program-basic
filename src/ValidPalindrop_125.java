public class ValidPalindrop_125 {
    public static void main(String[] args) {
        String str = " ";
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(str);

        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);

        }
        System.out.println(result+" aaa");
        if(result.equals(str)){
            System.out.println("Palindrom");
        }else
            System.out.println("Not a palindrom");

    }
}
