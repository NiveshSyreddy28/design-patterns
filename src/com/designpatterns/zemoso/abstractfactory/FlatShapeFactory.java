package com.designpatterns.zemoso.abstractfactory;

public class FlatShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new FlatRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new FlatSquare();
        }

        return null;
    }
}
