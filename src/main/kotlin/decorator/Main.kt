package main.kotlin.decorator

import main.kotlin.decorator.decorators.BaconBurger
import main.kotlin.decorator.decorators.CheeseBurger

fun main(args: Array<String>) {

    val burger = Burger()
    burger.assemble()

    println()

    val cheeseBurger = CheeseBurger(burger)
    cheeseBurger.assemble()

    println()

    val baconBurger = BaconBurger(burger)
    baconBurger.assemble()
}
