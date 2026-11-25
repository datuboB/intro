
fun main() {

    val numbers = mutableListOf<Int>()

    for (i in 1..5) {
        print("Enter number $i: ")
        val input = readln().toInt()

        numbers.add(input)
    }

    val sum = numbers.sum()

    val average = sum.toDouble() / numbers.size

    println("The numbers in the list are: $numbers")
    println("The sum of the numbers is: $sum")
    println("The average of the numbers is: $average")
}
