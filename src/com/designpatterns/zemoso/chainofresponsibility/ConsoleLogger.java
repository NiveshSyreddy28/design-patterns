package com.designpatterns.zemoso.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("\nStandard Console::Logger: " + message);

    }
}
