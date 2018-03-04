package main.kotlin.decorator.decorators

import main.kotlin.decorator.Hamburger

class BaconBurger(private val burger: Hamburger): BurgerDecorator(burger) {

    init {
        burger.ingredients.add("Bacon")
    }

    override val ingredients = burger.ingredients

    override fun assemble() {
        super.assemble()
        println(" ----------> Bacon Burger")
    }
}