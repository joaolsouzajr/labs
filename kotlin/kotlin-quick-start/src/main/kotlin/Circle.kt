package org.example

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

class Circle {
    fun area(radius: Double): Double {
        return PI.pow(sqrt(radius))
    }
}

fun main(args: Array<String>) {
    val circle = Circle()
    val radius = Random.nextDouble(1.0,10.0)
    println("Radius = $radius")
    println("Area = ${circle.area(radius)}")
}
