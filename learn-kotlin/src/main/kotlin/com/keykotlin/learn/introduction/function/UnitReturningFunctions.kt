package com.keykotlin.learn.introduction.function

fun greetMe(): Unit {
    println("Hello Kotlin from method returning Unit")
}

fun greetInferredUnit() {
    println("Hello Kotlin from method returning inferred oUnit")
}

fun main(args: Array<String>) {
    greetMe()
    greetInferredUnit()
}