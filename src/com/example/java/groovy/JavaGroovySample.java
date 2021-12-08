package com.example.java.groovy;

import com.example.java.groovy.nativec.NativeCalls;
import com.example.java.groovy.sys.calls.JavaSystemCalls;

public class JavaGroovySample {

  public static void main(String[] args) {
    JavaSystemCalls.execute();
    NativeCalls.printText();
    new NativeCalls().printText("Hello Native");
  }
}
