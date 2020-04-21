package io.github.wdpm.pattern.structural.proxy.JDKDynamic;

import io.github.wdpm.pattern.structural.proxy.RealSubject;
import io.github.wdpm.pattern.structural.proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @author evan
 * @date 2020/4/21
 */
public class JDKDynamicProxyClient {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader()
                , new Class<?>[]{Subject.class}
                , new JDKDynamicProxy());
        System.out.println(subject instanceof Proxy);
        subject.sayHello();
    }
}
