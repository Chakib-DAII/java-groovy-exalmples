package com.example.java.groovy

import com.example.java.groovy.sys.calls.GroovySysCalls
import com.example.java.groovy.sys.calls.JavaSystemCalls

class GroovyJavaSample {

    static void main(String[] args) {
        GroovySysCalls.execute()
        JavaSystemCalls.execute()
    }
}
