package com.designpatterns.zemoso.objectpool;

public class MyObjectPool extends ObjectPool<MyObject> {

  @Override
  protected MyObject create() {

    return new MyObject();
  }
}