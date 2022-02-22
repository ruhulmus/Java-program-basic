package oop.poliphormism.practice1;

public class Rectangle extends Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(double length, double width){
        return length*width;
    }
}
