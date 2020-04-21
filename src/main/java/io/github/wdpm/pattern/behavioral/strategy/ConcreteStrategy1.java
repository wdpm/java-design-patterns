package io.github.wdpm.pattern.behavioral.strategy;

/**
 * @author evan
 * @date 2020/4/21
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("Use ConcreteStrategy1");
    }
}
