package io.github.wdpm.pattern.behavioral.templatemethod;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    void step1() {
        System.out.println("ConcreteClassB step1()");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClassB step2()");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClassB step3()");
    }

    @Override
    void step4() {
        System.out.println("ConcreteClassB step4()");
    }
}
