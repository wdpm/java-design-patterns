package io.github.wdpm.pattern.creational.singleton;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SingletonLazyForSingleThread {
    private static SingletonLazyForSingleThread instance;

    private SingletonLazyForSingleThread() {
    }

    public static SingletonLazyForSingleThread getInstance() {
        if (instance == null) {
            instance = new SingletonLazyForSingleThread();
        }
        return instance;
    }
}
