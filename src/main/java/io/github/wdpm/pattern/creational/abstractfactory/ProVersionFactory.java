package io.github.wdpm.pattern.creational.abstractfactory;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class ProVersionFactory implements AbstractFactory {
    @Override
    public AbstractIPad7 createIPad7() {
        return new IPad7Pro("iPad 7 Pro");
    }

    @Override
    public AbstractIPhone11 createIPhone11() {
        return new IPhone11Pro("iPhone 11 Pro");
    }
}
