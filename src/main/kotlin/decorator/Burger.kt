package main.kotlin.decorator

class Burger() : Hamburger {

    override val ingredients = mutableListOf("Bread", "Steak", "Ketchup", "Pickles")

    override fun assemble() {
        println("Classic hamburger")
    }

}