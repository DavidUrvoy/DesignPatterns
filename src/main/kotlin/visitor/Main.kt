package main.kotlin.visitor

import main.kotlin.visitor.element.Firefox
import main.kotlin.visitor.element.Opera
import main.kotlin.visitor.visitor.LinuxBrowserInstall

fun main(args: Array<String>) {
    Firefox().accept(LinuxBrowserInstall())

    LinuxBrowserInstall().visit(Opera())
}