package io.github.wdpm.pattern.creational.abstractfactory;

import java.util.StringJoiner;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class IPhone11Pro implements AbstractIPhone11 {
    private String name;

    public IPhone11Pro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", IPhone11Pro.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
