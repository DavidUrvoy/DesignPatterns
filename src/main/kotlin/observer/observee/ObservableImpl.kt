package main.kotlin.observer.observee

import main.kotlin.observer.observer.Observer

class ObservableImpl(val observers: ArrayList<Observer>) : Observable {

    override fun subscribe(observer: Observer) {
        observers.add(observer)
    }

    override fun unsubscribe(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(notification: String) {
        observers.forEach { it.receive(notification) }
    }

}