package oop;

public class Box {
    double height;
    double width;
    double depth;

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }
    void dislayVol(){
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Depth : " + depth);
        System.out.println("Box Volume is : " + height * width * width);

    }
}
