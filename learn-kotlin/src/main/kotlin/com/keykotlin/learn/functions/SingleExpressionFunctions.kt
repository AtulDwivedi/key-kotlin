package com.keykotlin.learn.functions

fun doSquare(a: Int): Int = a * a
fun doSquareOmitReturnType(a: Int) = a * a

fun main(args: Array<String>) {
    println(doSquare(10))
    println(doSquareOmitReturnType(10))
}