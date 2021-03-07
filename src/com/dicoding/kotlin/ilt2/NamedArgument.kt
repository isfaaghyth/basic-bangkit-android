package com.dicoding.kotlin.ilt2

// named argument
fun getFullName(
    first: String,
    middle: String,
    last: String? = ""
): String {
    return "$first $middle $last"
}