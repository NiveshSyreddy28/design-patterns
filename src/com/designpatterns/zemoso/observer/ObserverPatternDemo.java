package com.designpatterns.zemoso.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First State change: 15");
        subject.setState(15);

        System.out.println("Second State change: 10");
        subject.setState(10);

    }
}
