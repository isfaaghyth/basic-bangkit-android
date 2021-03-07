package com.dicoding.kotlin.ilt3.ocp

class ShippingOrderService {

    fun checkout(shipping: Shipping) {
        shipping.calculate()
    }

}