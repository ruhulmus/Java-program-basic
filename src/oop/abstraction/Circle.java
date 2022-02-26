package oop.abstraction;

public class Circle extends Shape{
    double result;

    Circle(double r){
        super(r,r);
    }

    @Override
    void area() {
        result = Math.PI* dim1 * dim2;
        System.out.println("Circle : "+ result);
    }
}
