package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape shape ;
        shape = new Circle(20);
        shape.area();

        shape = new Rectangle(10,15);
        shape.area();

    }
}
