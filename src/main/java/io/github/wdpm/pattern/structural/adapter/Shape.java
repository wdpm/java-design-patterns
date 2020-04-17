package io.github.wdpm.pattern.structural.adapter;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public abstract class Shape {
    abstract void setLocation();

    abstract void getLocation();

    abstract void display();

    abstract void fill();

    abstract void setColor();

    abstract void unDisplay();
}
