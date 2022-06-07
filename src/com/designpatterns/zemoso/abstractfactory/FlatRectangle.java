package com.designpatterns.zemoso.abstractfactory;

public class FlatRectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside FlatRectangle::draw() method.");
    }
}
