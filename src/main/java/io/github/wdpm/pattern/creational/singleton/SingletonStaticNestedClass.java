package io.github.wdpm.pattern.creational.singleton;

/**
 * @author evan
 * @date 2020/4/21
 */
public class SingletonStaticNestedClass {
    private static class SingletonHolder {
        private static final SingletonStaticNestedClass INSTANCE = new SingletonStaticNestedClass();
    }

    private SingletonStaticNestedClass() {
    }

    public static SingletonStaticNestedClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
