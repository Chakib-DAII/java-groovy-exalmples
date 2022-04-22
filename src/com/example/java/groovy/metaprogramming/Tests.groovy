package com.example.java.groovy.metaprogramming

import spock.lang.Specification
import org.codehaus.groovy.runtime.metaclass.MethodSelectionException

class Tests extends Specification{

    void 'test dynamic properties'(){
        when:
        def ex = new MyExpando()
        ex.companyName = 'Apache'
        ex.favoriteLanguage = 'Groovy'
        then:
        ex.companyName == 'Apache'
        ex.favoriteLanguage == 'Groovy'

    }

    void 'test dynamic methods'(){
        when:
        def ex = new MyExpando()
        ex.addNumbers = {a,b,c -> a+b+c}
        then:
        100 == ex.addNumbers(35,25,40)
    }

    void 'test invoking dynamic method that is not a closure'(){
        when:
        def ex = new MyExpando()
        ex.someMethod = 9
        ex.someMethod()
        then:
        thrown(MethodSelectionException)
    }
}
