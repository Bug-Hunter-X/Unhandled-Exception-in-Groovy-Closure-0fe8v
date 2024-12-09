```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  closure.call()
  println "After closure execution"
}

myMethod { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong")
}
println "This line won't be reached"```