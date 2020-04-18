package io.github.wdpm.pattern.behavioral.templatemethod;

/**
 * @Created evan
 * @Date 2020/4/18
 */
abstract class AbstractClass {
    void templateMethod() {
        step1();
        step2();
        step3();
        step4();
    }

    abstract void step1();

    abstract void step2();

    abstract void step3();

    abstract void step4();
}
