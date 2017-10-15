package com.hamburgcodingschool.design.patterns.e1.observer;

import java.util.HashSet;
import java.util.Set;

public class DoneSubject {

    private Set<DoneObserver> observers = new HashSet<>();

    public void subscribe(DoneObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(DoneObserver observer) {
        observers.remove(observer);
    }

    public void accept(int index) {
        for (DoneObserver observer : observers) {
            observer.notifyDone(index);
        }
    }
}
