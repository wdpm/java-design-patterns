package io.github.wdpm.pattern.structural.proxy;

/**
 * @author evan
 * @date 2020/4/21
 */
public class Client {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.sayHello();

        // RealSubject sayHello()
    }
}
