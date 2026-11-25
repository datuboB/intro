package com.niitlab.intro

class Car(var name: String) {

    var brand = ""
    var speed = 0

    fun drive(){
        println("$name  is driving $brand at  $speed km/h")
    }
}