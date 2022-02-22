package oop.super_keyword2;

public class Vahicle {
    String color ;
    Double weight;

    Vahicle(String color, Double weight){
        this.color = color;
        this.weight =weight;
    }

    void attribute(){
        System.out.println("color: " + color);
        System.out.println("Weight: " + weight);
    }
}
