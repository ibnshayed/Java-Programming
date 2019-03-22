package main;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radious) {
        super(radious);
    }

    public Cylinder(double radious, double hight) {
        super(radious);
        this.height = hight;
    }

    public Cylinder(double radious, String color, double hight) {
        super(radious, color);
        this.height = hight;
    }

    public double getHight() {
        return height;
    }

    public void setHight(double hight) {
        this.height = hight;
    }

    public double getVolum(){
        return Math.PI * Math.pow(getRadious(),2) * height;
    }
}
