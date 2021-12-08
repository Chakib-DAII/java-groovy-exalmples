package com.example.java.groovy.nativec;

import java.io.File;

public class NativeCalls {
  public static native void printText();
  public native void printText(String text);

  static
  {
    //System.loadLibrary ("nativecalls");   /* Note lowercase of classname! */
    File f = new File("libNativeCalls.so");
    System.out.println(f.getAbsolutePath());
    System.load(f.getAbsolutePath());
  }

  public static void main(String[] args) {
    NativeCalls.printText();
    new NativeCalls().printText("Hello Native");
  }
}
