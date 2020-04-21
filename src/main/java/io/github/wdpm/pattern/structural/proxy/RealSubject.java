package io.github.wdpm.pattern.structural.proxy;

/**
 * @author evan
 * @date 2020/4/21
 */
public class RealSubject implements Subject {
    @Override
    public void sayHello() {
        System.out.println("RealSubject sayHello()");
    }
}
