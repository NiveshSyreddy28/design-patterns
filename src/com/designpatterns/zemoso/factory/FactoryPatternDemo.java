package com.designpatterns.zemoso.factory;

import java.util.Locale;
import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a shape like Circle, Rectangle or Square");
        String ShapeType = scanner.nextLine();
        scanner.close();

        ShapeType.toLowerCase();

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeType);
        shape.draw();

    }
}
