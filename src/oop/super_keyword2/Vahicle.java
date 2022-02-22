package oop.super_keyword2;

public class Vahicle {
    String color ;
    double  weight;

    Vahicle(String color, double weight){
        this.color = color;
        this.weight =weight;
    }

    void attribute(){
        System.out.println("color: " + color);
        System.out.println("Weight: " + weight);
    }
}
