package main.kotlin.observer.observee

import main.kotlin.observer.observer.Observer

interface Observable {

    fun subscribe(observer: Observer)

    fun unsubscribe(observer: Observer)

    fun notifyObservers(notification: String)

}