package com.designpatterns.zemoso.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
