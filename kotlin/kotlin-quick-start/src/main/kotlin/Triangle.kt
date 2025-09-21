package org.example

import kotlin.random.Random

class Triangle {



    fun isValid(side1: Int, side2: Int, side3: Int): Boolean {
        return if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            true
        } else {
            false
        }
    }
}

fun main (args: Array<String>) {
    val triangle = Triangle()
    val side1 = Random.nextInt(1, 20)
    val side2 = Random.nextInt(1, 20)
    val side3 = Random.nextInt(1, 20)
    println("Sides $side1, $side2, $side3")
    println("It is a valid triangle: ${triangle.isValid(side1, side2, side3)}")
}
