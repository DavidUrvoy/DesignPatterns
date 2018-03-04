package main.kotlin

import kotlin.properties.Delegates


 class User {
    var prop = null
    var azert: Int by Delegates.observable(0) {
        prop, old, new -> println("$old -> $new and $prop")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.azert = 1
    user.azert = 2
}

