package com.dicoding.kotlin.ilt2

import java.lang.StringBuilder

fun build(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append("World ")
    stringBuilder.action()
    return stringBuilder.toString()
}
