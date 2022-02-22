package oop.super_keyword2;

public class Car extends Vahicle{
    String gear;

    Car (String color, Double weight, String gear){
        super(color,weight);
        this.gear = gear;
    }
}
