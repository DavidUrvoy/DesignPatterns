package main.kotlin.observer.observer

class ObserverImpl : Observer {

    override fun receive(notification: String) {
        println("$this received a notification :\n$notification")
    }
}