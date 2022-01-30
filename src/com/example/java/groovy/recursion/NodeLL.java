package com.example.java.groovy.recursion;

/**
 * @author cdaii
 * @created 29/01/2022 - 4:20 PM
 * @project java-groovy-sample
 **/

public class NodeLL {
  private int val;
  private NodeLL next;

  public NodeLL(int val) {
    this.val = val;
  }

  public NodeLL(int val, NodeLL next) {
    this.val = val;
    this.next = next;
  }

  public NodeLL getNext() {
    return next;
  }

  public void setNext(NodeLL next) {
    this.next = next;
  }

  public int getVal() {
    return val;
  }
}
