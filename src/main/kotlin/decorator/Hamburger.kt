package main.kotlin.decorator

interface Hamburger {

    val ingredients: MutableList<String>

    fun assemble() {
        println("Here's the list of ingredients : $ingredients")
    }
}