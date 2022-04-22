package com.example.java.groovy.metaprogramming

class MyExpando {

    protected dynamicProperties = [:]
    void setProperty(String propertyName, value){
        dynamicProperties[propertyName]=value
    }

    def getProperty(String propertyName){
        dynamicProperties[propertyName]
    }

    def methodMissing(String methodName, args){
        def prop = dynamicProperties[methodName]
        if(prop instanceof Closure)
            //return prop(args[0],args[1],args[2])
            return prop(*args)
        throw new MissingMethodException()
    }
}
