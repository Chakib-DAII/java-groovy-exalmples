package com.example.java.groovy

import com.example.java.groovy.recursion.RecursionUtils
import com.example.java.groovy.sys.calls.GroovySysCalls
import com.example.java.groovy.sys.calls.JavaSystemCalls

class GroovyJavaSample {

    static void main(String[] args) {
        GroovySysCalls.execute()
        JavaSystemCalls.execute()
        println RecursionUtils.reverseString("Chakib daii kessou7")
        println RecursionUtils.isPalindrome("chakibobikahc")
        println RecursionUtils.findBinary(16653476867645345)
        println RecursionUtils.recursiveSummation(1403)
        int[] data = new int[] {1,2,3,4,5,6,7,8,9,10}
        println RecursionUtils.binarySearch(data,0, data.length-1, 10)
        println RecursionUtils.fib(10)
        data = new int[] {-12,2,324,65,98,0,67,33,9,1}
        RecursionUtils.mergeSort(data, 0, data.length-1)
        println data
    }
}
