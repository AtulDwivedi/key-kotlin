package com.keykotlin.learn.functions

import java.util.*

fun <T> convertToList(vararg ts: T): List<T> {
    val result = ArrayList<T>();
    for (t in ts) {
        result.add(t)
    }
    return result
}

fun <T> convertToListWithExtraElement(vararg ts: T, extra: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    result.add(extra)
    return result
}

fun <T> convertToListWithFirstElement(first: T, vararg ts: T): List<T> {
    val result = ArrayList<T>()
    result.add(first)
    for (t in ts) {
        result.add(t)
    }
    return result
}

//multiple vararg parameters are prohibited
/*
fun <T> convertToListAndMerge(vararg firstArr: T, vararg secondArr: T): List<T> {
    ...
}
*/

fun main(args: Array<String>) {
    println(convertToList(1, 2, 3, 4))

    // use of spread operator(*) to pass existing array also as vararg argument
    val existingList = arrayOf(3, 4, 5)
    println(convertToList(1, 2, *existingList, 6))

    //no value passed for parameter extra
    //println(convertToListWithExtraElement(1, 2, 3, 4, 5))
    println(convertToListWithExtraElement(1, 2, 3, 4, extra = 5))

    println(convertToListWithFirstElement(1, 2, 3, 4, 5))

    //mixing of named and positioned arguments is not allowed
    //println(convertToListWithFirstElement(first = 1, 2, 3, 4, 5))

    //an argument is already passed for this parameter
    //println(convertToListWithFirstElement(2, 3, 4, 5, first = 1))

    println(convertToListWithFirstElement(first = 1, ts = *arrayOf(2, 3, 4, 5)))
    println(convertToListWithFirstElement(ts = *arrayOf(2, 3, 4, 5), first = 1))
}