package com.designpatterns.zemoso.observer;
public class OctalObserver implements Observer{
    private Subject subject;

    public OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
