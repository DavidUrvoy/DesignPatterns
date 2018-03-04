package main.kotlin.mediator.mediator

import main.kotlin.mediator.element.Element

interface Mediator {

    val elements: ArrayList<Element>

    fun subscribe(element: Element) {
        elements.add(element)
    }

    fun send(message: String, origin: Element? = null)
}