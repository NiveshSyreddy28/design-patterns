package com.designpatterns.zemoso.factory;

public class ShapeFactory {
    public Shape getShape(String ShapeType){
        switch (ShapeType){

            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            default:
                System.out.println("Shape Type is Invalid");
                return null;
        }
    }
}
