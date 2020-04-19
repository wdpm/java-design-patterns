package io.github.wdpm.pattern.behavioral.observer;

/**
 * 被观察者类型
 *
 * @author evan
 * @since 2020/4/19
 */
public interface Subject {
    void registerObserver(Observer o);

    void notifyObservers(String thing);
}
