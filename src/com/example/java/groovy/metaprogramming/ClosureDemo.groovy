package com.example.java.groovy.metaprogramming


/**
 * @author cdaii* @created 22/04/2022 - 8:17 PM
 * @project java-groovy-sample
 * */

class ClosureDemo {

    void append(String arg){
        println "append(String) was called with arg ${arg}"
    }

    void run(){
        def c = {
            append('Jeff')
            append('Is in Antwerp')
        }
        //the default owner is this class
        c.owner = this
        def sb = new StringBuffer()
        //since we have append method in the class, the delegate got no chance to respond
        c.delegate = sb
        c.resolveStrategy = Closure.OWNER_FIRST //default value, the owner gets to respond to closure methods
        c.resolveStrategy = Closure.DELEGATE_FIRST //the delegate gets to respond to closure methods (methods will be fetched) first
        c.resolveStrategy = Closure.DELEGATE_ONLY // only the delegate will be used, if no delegate set a MissingPropertyException will be thrown
        c.resolveStrategy = Closure.OWNER_ONLY // only the owner will be used
        c()

        println "SB: ${sb}"
    }
    static void main(String[] args) {
        new ClosureDemo().run()
    }
}
