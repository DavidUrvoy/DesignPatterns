package main.kotlin.visitor.visitor

import main.kotlin.visitor.element.Chrome
import main.kotlin.visitor.element.Element
import main.kotlin.visitor.element.Firefox
import main.kotlin.visitor.element.Opera

class LinuxBrowserInstall : Visitor {
    override fun visit(element: Element) {
        println("$element has been configured")
    }

//    override fun visit(chrome: Chrome) {
//        println("$chrome has been configured")
//    }
//
//    override fun visit(opera: Opera) {
//        println("$opera has been configured")
//    }
}