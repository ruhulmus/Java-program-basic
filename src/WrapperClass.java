public class WrapperClass {
    public static void main(String[] args) {

        // Autoboxing : Primitive -> Object
        int x = 10;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+ y);

        //Unboxing : Object -> Primitive
        Double a = new Double(10.5);
        double b = a;
        System.out.println("b = "+ b);

        Double c =  new Double(15.5);
        double d = c.doubleValue();
        System.out.println("d =" + d);

        //premitive to string
        int i = 100;
        String j = Integer.toString(i);
        System.out.println("j = " + j);

        double e =  155.5;
        String f = Double.toString(e);
        System.out.println("f = " + e);


        //String to Primitive
        String s = "100";
        int t = Integer.parseInt(s);
        System.out.println("t = " + t);

        String m = "100.5";
        double n = Double.parseDouble(m);
        System.out.println("n = " + n);
    }
}
