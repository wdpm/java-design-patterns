package io.github.wdpm.pattern.creational.singleton;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
