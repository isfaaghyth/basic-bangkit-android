package com.dicoding.kotlin.ilt3.dip

/*
* payment service should be store
* the data to the database.
* */
class PaymentService(
    private val database: Database
) {

    fun insertPayment() {
        database.insert()
    }

}