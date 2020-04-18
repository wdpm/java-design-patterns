package io.github.wdpm.pattern.creational.singleton;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
