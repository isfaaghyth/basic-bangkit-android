package com.dicoding.kotlin.ilt3.srp

// the class is singleton
object FoodExpiry {

    // this is the utilities function
    // utilities it means like, this is the tools function
    // that can be use directly.
    fun isExpired(day: String): Boolean {
        return day != "Friday" // TODO
    }

}