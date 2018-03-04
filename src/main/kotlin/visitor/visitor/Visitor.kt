package main.kotlin.visitor.visitor

import main.kotlin.visitor.element.Chrome
import main.kotlin.visitor.element.Element
import main.kotlin.visitor.element.Firefox
import main.kotlin.visitor.element.Opera

interface Visitor {
    fun visit(element: Element)

    // or for specific :
    /**
     * fun visit(firefox: Firefox)
     * fun visit( ...
     * ...
     */
}