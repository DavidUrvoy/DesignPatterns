package main.kotlin.observer

import main.kotlin.observer.observee.ObservableImpl
import main.kotlin.observer.observer.Observer
import main.kotlin.observer.observer.ObserverImpl

fun main(args: Array<String>) {
    val observer1 = ObserverImpl()
    val observer2 = ObserverImpl()
    val observer3 = ObserverImpl()

    val observable = ObservableImpl(arrayListOf<Observer>(observer1, observer2, observer3))

    observable.notifyObservers("coucou")
}