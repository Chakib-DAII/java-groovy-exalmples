package com.example.java.groovy.test;

/**
 * @author cdaii
 * @created 13/12/2021 - 10:51 PM
 * @project java-groovy-sample
 **/

public abstract class Three implements One, Two{

  public Three() {
  }

  public Three(String a11, int a22) {
  }

  @Override
  public void method() {
    try {
      One.super.method();
      Two.super.method();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
