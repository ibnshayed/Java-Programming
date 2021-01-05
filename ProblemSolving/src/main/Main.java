package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle:");
        System.out.println("Constructor with no parametre:");
        Circle circle1 = new Circle();
        System.out.println("Radious = " + circle1.getRadious());
        System.out.println("Color = " + circle1.getColor());
        System.out.println("Area = " + circle1.getArea());
        System.out.println(circle1.toString());

        System.out.println("\nContructor with 1 (radious) parametre:");
        Circle circle2 = new Circle(4);
        System.out.println("Radious = " + circle2.getRadious());
        System.out.println("Color = " + circle2.getColor());
        System.out.println("Area = " + circle2.getArea());
        System.out.println(circle2.toString());

        System.out.println("\nConstructor with 2 (radious,color) parametre:");
        Circle circle3 = new Circle(5, "Orange");
        System.out.println("Radious = " + circle3.getRadious());
        System.out.println("Color = " + circle3.getColor());
        System.out.println("Area = " + circle3.getArea());
        System.out.println(circle3.toString());

        System.out.println("\nCylinder:");
        System.out.println("Constructor with no parametre:");
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Height = " + cylinder1.getHight());
        System.out.println("Volum = " + cylinder1.getVolum());
        System.out.println("Radious = " + cylinder1.getRadious());
        System.out.println("Color = " + cylinder1.getColor());
        System.out.println("Area = " + cylinder1.getArea());
        System.out.println(cylinder1.toString());


        System.out.println("\nConstructor with 1 (radious) parametre:");
        Cylinder cylinder2 = new Cylinder(6);
        System.out.println("Height = " + cylinder2.getHight());
        System.out.println("Volum = " + cylinder2.getVolum());
        System.out.println("Radious = " + cylinder2.getRadious());
        System.out.println("Color = " + cylinder2.getColor());
        System.out.println("Area = " + cylinder2.getArea());
        System.out.println(cylinder2.toString());

        System.out.println("\nConstructor with 2 (radious,height) parametre:");
        Cylinder cylinder3 = new Cylinder(3, 5);
        System.out.println("Height = " + cylinder3.getHight());
        System.out.println("Volum = " + cylinder3.getVolum());
        System.out.println("Radious = " + cylinder3.getRadious());
        System.out.println("Color = " + cylinder3.getColor());
        System.out.println("Area = " + cylinder3.getArea());
        System.out.println(cylinder3.toString());

        System.out.println("\nConstructor with 3 (radious,color,height) parametre:");
        Cylinder cylinder4 = new Cylinder(6, "Blue", 4);
        System.out.println("Height = " + cylinder4.getHight());
        System.out.println("Volum = " + cylinder4.getVolum());
        System.out.println("Radious = " + cylinder4.getRadious());
        System.out.println("Color = " + cylinder4.getColor());
        System.out.println("Area = " + cylinder4.getArea());
        System.out.println(cylinder4.toString());

        System.out.println("\nUsing Set Method: ");
        circle3.setRadious(9);
        circle3.setColor("Green");
        System.out.println(circle3.toString());

        System.out.println("\n");
        cylinder4.setHight(10);
        System.out.println(cylinder4.toString());
    }
}
