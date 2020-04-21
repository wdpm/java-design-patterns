package io.github.wdpm.pattern.structural.proxy.JDKDynamic;

import io.github.wdpm.pattern.structural.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author evan
 * @date 2020/4/21
 */
public class JDKReflectProxy implements InvocationHandler {

    private Subject targetClass;

    public JDKReflectProxy(Subject targetClass) {
        this.targetClass = targetClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method myMethod = targetClass.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
        myMethod.setAccessible(true);
        return myMethod.invoke(targetClass, args);
    }
}
