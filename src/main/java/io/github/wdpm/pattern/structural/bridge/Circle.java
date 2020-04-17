package io.github.wdpm.pattern.structural.bridge;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class Circle extends Shape {
    public Circle(Drawing drawing) {
        super(drawing);
    }

    @Override
    void draw() {
        drawCircle();
    }

    @Override
    protected void drawCircle() {
        super.drawCircle();
    }
}
