package oop.abstraction;

public class Traingle extends Shape{
    double result;
    Traingle(double dim1, double dim2){
        super(dim1,dim2);
    }
    @Override
    void area() {
        result = .5* dim1 * dim2;
        System.out.println("Triangle : "+ result);
    }
}
