package com.example.java.groovy.recursion;

/**
 * @author cdaii
 * @created 29/01/2022 - 4:20 PM
 * @project java-groovy-sample
 **/

public class NodeTree {
  private int val;
  private NodeTree left;
  private NodeTree right;

  public NodeTree(int val) {
    this.val = val;
  }

  public NodeTree getLeft() {
    return left;
  }

  public void setLeft(NodeTree left) {
    this.left = left;
  }

  public NodeTree getRight() {
    return right;
  }

  public void setRight(NodeTree right) {
    this.right = right;
  }

  public int getVal() {
    return val;
  }
}
