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
    }
}
