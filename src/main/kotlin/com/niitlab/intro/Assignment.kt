package com.niitlab.intro

fun main(){
    print("enter your name: ")
    val name = readln()
    print("enter your score for python: ")
    val python = readln().toInt()
    print("enter your score for java: ")
    val java = readln().toInt()
    print("enter your score for html5: ")
    val html5 = readln().toInt()


    val avg = average(python, java, html5)
    val grd = grade(average = avg)

    println(" student: $name")
    println(" Average: $avg")
    println("Grade: $grd")

}

fun average(python: Int, java: Int, html5: Int) = (python + java + html5) / 3

fun grade(average: Int): String{
    return if(average >= 90 && average <= 100){
        "A"
    }

    else if(average >= 75 && average < 90) {
        "B"
    }
    else if (average >= 50 && average < 75) {
        "C"
    }
    else if (average >= 0 && average < 50){
        "F"
    }
    else{
        "invalid scores"
    }

}


