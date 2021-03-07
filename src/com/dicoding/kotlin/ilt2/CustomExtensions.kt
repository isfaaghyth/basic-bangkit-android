package com.dicoding.kotlin.ilt2

// extension function
fun Int.plusThree(): Int {
    return this + 3
}

// extension properties
val String.firstCharacter: String
    get() = this[0].toString()

fun Any?.plusThree(): Int {
    if (this == null) return -1
    return when {
        this is Int -> this + 3
        this is Float -> (this + 3).toInt()
        else -> 0
    }
}