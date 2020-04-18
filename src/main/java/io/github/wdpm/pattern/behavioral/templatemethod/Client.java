package io.github.wdpm.pattern.behavioral.templatemethod;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();

        System.out.println();

        ConcreteClassB concreteClassB = new ConcreteClassB();
        concreteClassB.templateMethod();

        /*
        ConcreteClassA step1()
        ConcreteClassA step2()
        ConcreteClassA step3()
        ConcreteClassA step4()

        ConcreteClassB step1()
        ConcreteClassB step2()
        ConcreteClassB step3()
        ConcreteClassB step4()
         */
    }
}
