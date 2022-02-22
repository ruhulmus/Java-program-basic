package oop.super_keyword2;

public class Car extends Vahicle{
    String gear;

    Car (String color, double weight, String gear){
        super(color,weight);
        this.gear = gear;
    }

    @Override
    void attribute(){
        super.attribute();
        System.out.println("gear :"+ this.gear);
    }
}
