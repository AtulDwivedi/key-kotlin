package com.keykotlin.learn.introduction.function

fun time(date: String, hours: Int = 0, mins: Int = 0, secs: Int = 0, millis: Int = 0) {
    println("Time is: $date:$hours:$mins:$secs:$millis")
}

fun time(date: String = "2018-10-31", vararg ts: String) {
    print("Time is: $date")
    for (t in ts) {
        print(":$t")
    }
}

fun main(args: Array<String>) {
    //without named arguments[Positional Arguments]
    time("2018-10-31")
    time("2018-10-31", 10, 20, 30, 40)

    //with named arguments
    //- more readability
    time("2018-10-31", hours = 10, mins = 20, secs = 30, millis = 40)
    //- more flexibility to make call with specific default argument
    time("2018-10-31", millis = 40)
    //- can be called in any order if all are named arguments
    time(millis = 40, hours = 10, date = "2018-10-31", mins = 20, secs = 30)
    //- if mix of positional and name arguments are used then all the positional arguments should be placed before the first named one
    //time(millis = 40, "2018-10-31") - not allowed
    time("2018-10-31", secs = 30, millis = 40)

    //-variable number of arguments with named arguments(* is spread operator)
    time(ts = *arrayOf("10", "20", "30", "40"))
}