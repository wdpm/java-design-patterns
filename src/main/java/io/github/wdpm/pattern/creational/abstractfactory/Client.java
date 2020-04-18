package io.github.wdpm.pattern.creational.abstractfactory;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class Client {
    public static void main(String[] args) {

        // NormalVersionFactory -> AbstractFactory -> AbstractIPad7/AbstractIPhone11
        AbstractFactory normalVersionFactory = new NormalVersionFactory();
        AbstractIPad7        iPad7                = normalVersionFactory.createIPad7();
        AbstractIPhone11     iPhone11             = normalVersionFactory.createIPhone11();
        System.out.println(iPad7);
        System.out.println(iPhone11);

        // ProVersionFactory -> AbstractFactory -> AbstractIPad7/AbstractIPhone11
        AbstractFactory proVersionFactory = new ProVersionFactory();
        AbstractIPad7     iPad7Pro          = proVersionFactory.createIPad7();
        AbstractIPhone11  iPhone11Pro       = proVersionFactory.createIPhone11();
        System.out.println(iPad7Pro);
        System.out.println(iPhone11Pro);

        /*
        IPad7[name='iPad 7']
        IPhone11[name='iPhone 11']
        IPad7Pro[name='iPad 7 Pro']
        IPhone11Pro[name='iPhone 11 Pro']
         */
    }
}
