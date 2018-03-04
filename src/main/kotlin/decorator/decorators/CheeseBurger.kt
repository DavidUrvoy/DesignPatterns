package main.kotlin.decorator.decorators

import main.kotlin.decorator.Hamburger

class CheeseBurger(private val burger: Hamburger): BurgerDecorator(burger) {

    init {
        burger.ingredients.add("Cheese")
    }

    override val ingredients = burger.ingredients

    override fun assemble() {
        super.assemble()
        println(" ------>  CHEESEBURGER !")
    }
}