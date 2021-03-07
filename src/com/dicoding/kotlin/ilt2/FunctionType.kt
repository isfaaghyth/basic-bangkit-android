package com.dicoding.kotlin.ilt2

val sum: (Int, Int) -> String = { number1, number2 ->
    "$number1 + $number2 = ${number1 + number2}"
}

val message: (String) -> String = { name ->
    "Hello $name"
}