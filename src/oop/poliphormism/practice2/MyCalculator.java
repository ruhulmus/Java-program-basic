package oop.poliphormism.practice2;

public class MyCalculator {
    int x,y,z;
    public int multiplication(){
        return z = x*y;
    }
    public static void main(String[] args) {

        Calculation obj = new Calculation(20,15);
        MyCalculator obj2 = new MyCalculator();

        System.out.println("Addition : "+ obj.addition());
        System.out.println("Substruct : "+ obj.substruct());
 //        this.multiplication();
    }
}
