package main.kotlin.mediator.mediator

import main.kotlin.mediator.element.Element

class OnlineChat(override val elements: ArrayList<Element>) : Mediator {
    override fun send(message: String, origin: Element?) {
        val completeMessage = if (origin != null) {
            "${origin.name} sent a message :\n$message"
        } else {
            message
        }
        elements.forEach {
            if (it != origin) {
                it.receive(completeMessage)
            }
        }
    }
}