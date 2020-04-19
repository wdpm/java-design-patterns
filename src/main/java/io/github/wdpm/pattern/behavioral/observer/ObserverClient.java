package io.github.wdpm.pattern.behavioral.observer;

/**
 * 测试类
 *
 * @author evan
 * @since 2020/4/19
 */
public class ObserverClient {
    public static void main(String[] args) {
        ASubject aSubject = new ASubject();
        aSubject.registerObserver(new AObserver());
        aSubject.notifyObservers("something");

        /*
        thing is: something
        AObserver notify() called
         */
    }
}
