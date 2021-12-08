package com.example.java.groovy.sys.calls;

class GroovySysCalls {
    def static execute(){
        def dir = "C:\\Users\\cdaii\\"
        def command = "cmd /c dir"
        String[] env = System.getenv().collect { k, v -> "$k=$v" }
        Process process = command.execute(env, new File(dir))
        def out = new StringBuffer()
        def err = new StringBuffer()
        process.consumeProcessOutput( out, err )
        process.waitFor()
        if( out.size() > 0 ) println out
        if( err.size() > 0 ) println err
    }
}