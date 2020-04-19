package io.github.wdpm.pattern.behavioral.observer;

/**
 * 具体的观察者
 *
 * @author evan
 * @since 2020/4/19
 */
public class AObserver implements Observer {
    @Override
    public void notify(String thing) {
        System.out.println("thing is: " + thing);
        System.out.println("AObserver notify() called");
    }
}