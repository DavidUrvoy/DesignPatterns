package main.kotlin.mediator.element

import main.kotlin.mediator.mediator.Mediator

class UserElement(override val mediator: Mediator, override val name: String) : Element {

    override fun receive(message: String) {
        println("----- $name has received this message : -----\n$message")
    }

}