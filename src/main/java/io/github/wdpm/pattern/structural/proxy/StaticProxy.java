package io.github.wdpm.pattern.structural.proxy;

/**
 * @author evan
 * @date 2020/4/21
 */
public class StaticProxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void sayHello() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        realSubject.sayHello();
    }
}
