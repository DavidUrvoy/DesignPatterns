package main.kotlin.mediator

import main.kotlin.mediator.element.Element
import main.kotlin.mediator.element.UserElement
import main.kotlin.mediator.mediator.OnlineChat

fun main(args: Array<String>) {

    val elements = arrayListOf<Element>()
    val mediator = OnlineChat(elements)

    val admin = UserElement(mediator, "admin")
    val moderator = UserElement(mediator, "moderator")
    val user = UserElement(mediator, "user")

    elements.addAll(listOf(admin, moderator, user))

    admin.send("coucou")
}