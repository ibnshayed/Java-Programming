package main;

public class Circle {
    private double radious;
    private String color;

    public Circle() {
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(double radious, String color) {
        this.radious = radious;
        this.color = color;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radious, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                ", color='" + color + '\'' +
                '}';
    }
}
