package com.designpatterns.zemoso.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String shape){
        if(shape.equalsIgnoreCase("Rounded")){
            return new RoundedShapeFactory();
        }
        else{
            return new FlatShapeFactory();
        }
    }
}
