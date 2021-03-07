package com.dicoding.kotlin.ilt1

fun ifStatement(a: Int, b: Int) {
    val message = if (a > b) {
        "a grather than b"
    } else if (a < b) {
        "a less than b"
    } else {
        "a equals b"
    }

    println(message)
}

fun whenStatement(a: Int) {
    val range = 1..10
    val result = when (a) {
        in range -> "value in the range"
        !in range -> "value is not in the range"
        else -> "undefined"
    }

    println(result)
}