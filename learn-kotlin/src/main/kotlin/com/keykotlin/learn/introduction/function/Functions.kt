package com.keykotlin.learn.introduction.function

//function that takes a parameter of type string and
// returns Unit(i.e. no return value / void)
fun greet(message: String) {
    println(message)
}

//function that take second optional parameter with default value "Kotlin" and
// returns Unit(i.e. no return value / void)
fun greetWithOptionalParameter(message: String, name: String = "Kotlin") {
    println("$message, $name")
}

//function that takes two Int parameters and
//return Int result
fun sum(a: Int, b: Int): Int {
    return a + b
}

//single-expression function that returns an integer (inferred)
fun multiply(a: Int, b: Int) = a * b

fun main(args: Array<String>) {
    greet("Hello Kotlin")
    greetWithOptionalParameter("Hello", "There")
    //name arguments
    greetWithOptionalParameter(name = "There", message = "Hello")
    greetWithOptionalParameter("Hello")
    print(sum(10, 20))
    print(multiply(10, 20))
}