package main.kotlin.visitor.element

import main.kotlin.visitor.visitor.Visitor

class Firefox : Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun toString() = "Firefox"
}