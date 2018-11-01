package com.keykotlin.learn.functions

fun greetMe(): Unit {
    println("Hello Kotlin from method returning Unit")
}

fun greetInferredUnit() {
    println("Hello Kotlin from method returning inferred Unit")
}

fun greetMe(message: String): Unit {
    if (message != null) {

        println("$message")
    } else {
        println("Hello There!")
    }
    //return Unit - it's optional
    //return - it's also optional
}

fun main(args: Array<String>) {
    greetMe()
    greetInferredUnit()
}