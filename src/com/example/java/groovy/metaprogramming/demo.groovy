c = {
    append('Jeff')
    append('Is in Antwerp')
}

sb = new StringBuffer()
//delegating a closure to the StringBuffer class to respond to methods inside the closure
c.delegate = sb
c()

println "SB: ${sb}"
