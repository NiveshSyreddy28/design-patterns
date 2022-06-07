package com.designpatterns.zemoso.singleton;

public class Singleton {
    //Early Instantiation

    //Creating the instance during the declaration time
    private static Singleton singletonObject = new Singleton();

    //Making the constructor private
    private Singleton(){};

    // Static method to return the instance of class
    public static Singleton getSingletonObject(){
        return singletonObject;
    }
}

//public Singleton{
//    //Lazy Instantiation
//
//    private static Singleton object;
//
//    private Singleton(){};
//
//    public static Singleton getObject(){
//        if (object == null){
//            synchronized (Singleton.class){
//                if (object == null){
//                    object = new Singleton();
//                }
//            }
//        }
//        return object;
//    }

