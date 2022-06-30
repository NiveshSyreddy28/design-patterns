package com.designpatterns.zemoso.objectpool;

import java.util.concurrent.atomic.AtomicInteger;

public class MyObject {

  private static final AtomicInteger counter = new AtomicInteger(0);

  private final int id;

  public MyObject() {
    id = counter.incrementAndGet();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return String.format("MyObject id=%d", id);
  }
}