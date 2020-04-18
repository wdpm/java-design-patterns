package io.github.wdpm.pattern.creational.abstractfactory;

import java.util.StringJoiner;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class IPad7 implements AbstractIPad7 {
    private String name;

    public IPad7(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", IPad7.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
