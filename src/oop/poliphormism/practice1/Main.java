package oop.poliphormism.practice1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(10,15);
        Triangle triangle = new Triangle(20,25);

        System.out.print("Shape : ");
        shape.area();
        System.out.println("");
        System.out.print("Rectangle : ");
        rectangle.area();
        System.out.println("");
        System.out.print("Triangle : ");
        triangle.area();

    }
}
