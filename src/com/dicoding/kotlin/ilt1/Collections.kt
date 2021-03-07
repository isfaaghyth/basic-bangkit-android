package com.dicoding.kotlin.ilt1

fun map() {
    val cities = mapOf(
        "Jakarta" to "Indonesia",
        "New Delhi" to "India"
    )

    println(cities["Jakarta"])
}

fun list() {
    // can add or remove
    val mutableList = mutableListOf(1,2,3)

    // cannot add or remove
    val list = listOf(1,2,3)
}

fun operatorList() {
    val list = listOf(1,2,3)
        .filter { it != 2 }
    println(list)
}