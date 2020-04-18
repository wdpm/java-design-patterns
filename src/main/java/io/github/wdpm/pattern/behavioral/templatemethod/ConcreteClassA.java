package io.github.wdpm.pattern.behavioral.templatemethod;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    void step1() {
        System.out.println("ConcreteClassA step1()");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClassA step2()");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClassA step3()");
    }

    @Override
    void step4() {
        System.out.println("ConcreteClassA step4()");
    }
}
