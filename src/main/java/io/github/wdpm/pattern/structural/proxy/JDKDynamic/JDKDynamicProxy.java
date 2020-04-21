package io.github.wdpm.pattern.structural.proxy.JDKDynamic;

import io.github.wdpm.pattern.structural.proxy.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author evan
 * @date 2020/4/21
 */
public class JDKDynamicProxy implements InvocationHandler {
    private RealSubject realSubject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        method.invoke(realSubject, args);
        return realSubject;
    }
}
