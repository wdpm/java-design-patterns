package io.github.wdpm.pattern.creational.abstractfactory;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class NormalVersionFactory implements AbstractFactory {
    @Override
    public AbstractIPad7 createIPad7() {
        return new IPad7("iPad 7");
    }

    @Override
    public AbstractIPhone11 createIPhone11() {
        return new IPhone11("iPhone 11");
    }
}
