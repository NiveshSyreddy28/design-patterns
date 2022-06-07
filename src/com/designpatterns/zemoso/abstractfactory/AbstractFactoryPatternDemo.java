package com.designpatterns.zemoso.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory("flat");
        Shape shape1 = shapeFactory1.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory1.getShape("Square");
        shape2.draw();
        System.out.println("\n");

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory("rounded");
        Shape shape3 = shapeFactory2.getShape("Rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory2.getShape("Square");
        shape4.draw();
    }
}
