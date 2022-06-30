package com.designpatterns.zemoso.objectpool;

public class ObjectPoolDemo {

    public static void main(String[] args) {

        var pool = new MyObjectPool();
        System.out.println(pool.toString());
        System.out.println();

        var object1 = pool.checkOut();
        System.out.println(pool.toString());
        System.out.println();

        var object2 = pool.checkOut();
        var object3 = pool.checkOut();
        System.out.println(pool.toString());
        System.out.println();

        pool.checkIn(object1);
        pool.checkIn(object2);
        System.out.println(pool.toString());
        System.out.println();

        var object4 = pool.checkOut();
        var object5 = pool.checkOut();
        System.out.println(pool.toString());
        System.out.println();

        pool.checkIn(object3);
        pool.checkIn(object4);
        pool.checkIn(object5);
        System.out.println(pool.toString());

    }
}