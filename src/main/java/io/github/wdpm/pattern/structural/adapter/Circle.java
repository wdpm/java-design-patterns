package io.github.wdpm.pattern.structural.adapter;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class Circle extends Shape {

    private final OtherCircle otherCircle;

    public Circle() {
        otherCircle = new OtherCircle();
    }

    @Override
    void setLocation() {
        otherCircle.setLocation();
    }

    @Override
    void getLocation() {
        otherCircle.getLocation();
    }

    @Override
    void display() {
        otherCircle.displayIt();
    }

    @Override
    void fill() {
        otherCircle.fillIt();
    }

    @Override
    void setColor() {
        otherCircle.setItsColor();
    }

    @Override
    void unDisplay() {
        otherCircle.unDisplayIt();
    }
}
