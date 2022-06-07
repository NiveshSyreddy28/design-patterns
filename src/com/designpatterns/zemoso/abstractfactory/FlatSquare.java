package com.designpatterns.zemoso.abstractfactory;

public class FlatSquare implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside FlatSquare::draw() method.");
    }
}
