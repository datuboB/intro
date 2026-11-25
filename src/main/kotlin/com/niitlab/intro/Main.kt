package com.niitlab.intro

import com.niitlab.compute.*
fun main() {

    println("welcome to kotlin")

    var carOne = Car(name="bianca")

    carOne.brand = "volvo"
    carOne.speed = 80
    carOne.drive()
}


   val dog = Animal()