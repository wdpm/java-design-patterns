package io.github.wdpm.pattern.structural.bridge;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class Rectangle extends Shape {
    public Rectangle(Drawing drawing) {
        super(drawing);
    }

    @Override
    void draw() {
        drawLine();
    }

    @Override
    protected void drawLine() {
        super.drawLine();
    }
}
