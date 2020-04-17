package io.github.wdpm.pattern.structural.adapter;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.getLocation();
        shape.setLocation();
        shape.fill();
        shape.setColor();
        shape.display();
        shape.unDisplay();
    }
}
