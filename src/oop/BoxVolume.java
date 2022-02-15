package oop;

public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(20,30,10);

        System.out.println("Box 1 :");
        box1.dislayVol();
        System.out.println("Box 2 :");
        box2.dislayVol();
    }
}
