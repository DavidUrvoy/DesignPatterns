package main.kotlin.visitor.element

import main.kotlin.visitor.visitor.Visitor

interface Element {
    fun accept(visitor: Visitor)
}