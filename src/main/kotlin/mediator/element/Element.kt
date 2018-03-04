package main.kotlin.mediator.element

import main.kotlin.mediator.mediator.Mediator

interface Element {

    val mediator: Mediator
    val name: String

    fun send(message: String) {
        mediator.send(message, this)
    }

    fun receive(message: String)
}