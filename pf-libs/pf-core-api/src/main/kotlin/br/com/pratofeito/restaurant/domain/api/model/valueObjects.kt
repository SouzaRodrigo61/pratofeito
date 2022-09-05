package br.com.pratofeito.restaurant.domain.api.model

import java.io.Serializable
import java.util.*

data class RestaurantId(val identifier: String) : Serializable {
    constructor(): this(UUID.randomUUID().toString())

    override fun toString(): String = identifier
}