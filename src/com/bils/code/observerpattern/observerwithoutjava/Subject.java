package com.bils.code.observerpattern.observerwithoutjava;

/**
 * Created by nabilla on 3/20/16.
 */
public interface Subject {

    void registerObserver(Observer obs);

    void removeObserver(Observer obs);

    void notifyObservers();
}
