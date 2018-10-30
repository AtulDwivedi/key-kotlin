package com.keykotlin.learn.introduction.function

fun greetMe(message: String, name: String = "Kotlin") {
    println("$message, $name")
}

fun greetMeFirstParamAsDefault(message: String = "Hello", name: String) {
    println("$message, $name")
}

fun sumAndDoSomeThing(a: Int = 10, b: Int = 20, action: () -> Unit) {
    action()
    println(a + b)
}

open class A {
    open fun doSomthing(a: Int = 10) {
        println("A: $a")
    }
}

class B : A() {
    //an overriding function is not allowed to specify default values for its parameters
    /*override fun doSomthing(a: Int = 12) {
        println("B: $a")
    }*/

    override fun doSomthing(a: Int) {
        println("B: $a")
    }
}

fun main(args: Array<String>) {
    greetMe("Hello", "There")
    greetMe("Hello")
    greetMeFirstParamAsDefault(name = "Dude")
    sumAndDoSomeThing() { print("Hello, ") }
    sumAndDoSomeThing(1) { print("Hello, ") }
    sumAndDoSomeThing(b = 1) { print("Hello, ") }
    sumAndDoSomeThing(1, 2) { print("Hello, ") }
    B().doSomthing() // B: 10
    B().doSomthing(20) // B: 20
}