package io.github.wdpm.pattern.creational.abstractfactory;

/**
 * 将工厂的变化封装于这个AbstractFactory中
 *
 * @Created evan
 * @Date 2020/4/18
 */
interface AbstractFactory {
    AbstractIPad7 createIPad7();

    AbstractIPhone11 createIPhone11();
}
