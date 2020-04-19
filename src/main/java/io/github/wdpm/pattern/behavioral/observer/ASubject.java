package io.github.wdpm.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 *
 * @author evan
 * @since 2020/4/19
 */
public class ASubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(String thing) {
        observers.forEach(o -> o.notify(thing));
    }
}
