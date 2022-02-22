package oop.poliphormism.practice1;

public class Triangle extends Shape{
    double base,length;

    Triangle(double base, double length){
        this.base = base;
        this.length = length;
    }

    double area(){
        return .5*base*length;
    }
}
