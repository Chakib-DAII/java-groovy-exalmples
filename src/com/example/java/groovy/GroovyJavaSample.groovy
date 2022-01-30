package com.example.java.groovy

import com.example.java.groovy.recursion.NodeLL
import com.example.java.groovy.recursion.NodeTree
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

        NodeLL n5 = new NodeLL(1)
        NodeLL n4 = new NodeLL(5, n5)
        NodeLL n3 = new NodeLL(8, n4)
        NodeLL n2 = new NodeLL(0, n3)
        NodeLL n1 = new NodeLL(9, n2)
        println 'first Linked List'
        printLinkedList n1
        NodeLL reversed = RecursionUtils.reverseLinkedList n1
        println 'first Linked List reversed'
        printLinkedList reversed

        NodeLL nb9 = new NodeLL(14)
        NodeLL nb8 = new NodeLL(5, nb9)
        NodeLL nb7 = new NodeLL(86, nb8)
        NodeLL nb6 = new NodeLL(54, nb7)
        NodeLL nb5 = new NodeLL(856, nb6)
        NodeLL nb4 = new NodeLL(545, nb5)
        NodeLL nb3 = new NodeLL(83, nb4)
        NodeLL nb2 = new NodeLL(90, nb3)
        NodeLL nb1 = new NodeLL(923, nb2)

        println 'second Linked List'
        printLinkedList nb1
        NodeLL sorted = RecursionUtils.sortedMergeLinkedLists reversed, nb1
        println 'sorted Linked Lists'
        printLinkedList sorted

        List<Integer> dataInput = Arrays.asList(100, 80, 50, 90, 85, 75, 60, 65, 115, 130, 150, 195, 30, 35)
        NodeTree root = null
        for(Integer val : dataInput)
            root = RecursionUtils.insertNodeInTree root, val

        println 'tree '
        RecursionUtils.printLeaves root
    }

    static void printLinkedList(NodeLL head){
        println head.val
        if (head.next != null){
            printLinkedList(head.next)
        }
    }

}
