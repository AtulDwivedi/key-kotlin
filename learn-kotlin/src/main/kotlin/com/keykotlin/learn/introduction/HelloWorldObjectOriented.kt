package com.keykotlin.learn.introduction

class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter("Kotlin").greet()
}