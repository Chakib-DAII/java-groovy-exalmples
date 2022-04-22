name = 'jake'
println name.class

String.metaClass.doSomething = {
    println 'in the doSomething method'
}

String.metaClass.doSomething = { arg ->
    println "in the doSomething method: ${arg}"
}
name.doSomething()
name.doSomething("hey")

String.metaClass.vowels = {
    delegate.findAll{
        it.toLowerCase().matches('[aeiou]')
    }
}
def message = 'Groovy is a great language'
println message.vowels()