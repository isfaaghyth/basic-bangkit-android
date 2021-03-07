package com.dicoding.kotlin.ilt1

fun operator() {
    // null-safety operator
    val number1 = 20
    val number2 = 20

    // arithmetic operator
    println("addition => ${number1.plus(number2)}")
    println("substraction => ${number1.minus(number2)}")
    println("multiplication => ${number1.times(number2)}")
    println("divison => ${number1.div(number2)}")
    println("modulus => ${number1.rem(number2)}")

    // assignment operator
    var a = 10
    var b = 2
    a += b
    println(a)

    // comparison operator
    var text1 = "abc"
    var text2 = "xyz"

    var varA = 2
    var varB = 4

    println("equals => ${text1 == text2}")
    println("not equals => ${text1 != text2}")
    println("greater than => ${varA > varB}")
    println("less than => ${varA < varB}")

    var andA = true
    var andB = false
    var resultText1 = andA && andB
    var resultText2 = andA || andB
    var resultText3 = !andA

    println("AND => $resultText1")
    println("OR => $resultText2")
    println("NOT => $resultText3")

    // increment/decrement operator
    var incrementA = 20
    incrementA++
    println(incrementA)

    var decrementB = 20
    decrementB--
    println(decrementB)
}