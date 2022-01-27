package com.example.java.groovy.test;

/**
 * @author cdaii
 * @created 13/12/2021 - 10:51 PM
 * @project java-groovy-sample
 **/

public interface One {
  default void method () {
    System.out.println("One");
  }
}
