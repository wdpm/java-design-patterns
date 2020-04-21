package io.github.wdpm.pattern.creational.singleton;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SingletonLazyForMultiThread {
    private static SingletonLazyForMultiThread instance;

    private SingletonLazyForMultiThread() {
    }

    public synchronized static SingletonLazyForMultiThread getInstance() {
        if (instance == null) {
            instance = new SingletonLazyForMultiThread();
        }
        return instance;
    }
}
