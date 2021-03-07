package com.dicoding.kotlin.ilt1

// unit type
fun setUserUnitType(name: String, age: Int) {
    println("Your name is $name, your age is $age years old")
}

// return type
fun setUserValueType(name: String, age: Int): String {
    return "Your name is $name, your age is $age years old"
}

// single-expression type
fun exampleFunction() = "this is function of exampleFunction"