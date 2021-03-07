package com.dicoding.kotlin.ilt1

fun whileLoops() {
    while (false) {
        println("hai from while!")
    }
}

fun doWhileLoops() {
    do {
        println("hai from do while!")
    } while (false)
}

fun forLoop(a: Int) {
    for (i in 1..a) {
        println(i)
    }
}

fun forEachLoop(a: Int) {
    (a.rangeTo(10)).forEach {
        println(it)
    }
}

fun forContinueAndBreak() {
    val listNumber = 1.rangeTo(10)
    for (number in listNumber) {
        if (number == 2) continue
        if (number == 9) break
        println(number)
    }
}