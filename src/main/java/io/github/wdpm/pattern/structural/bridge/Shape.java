package io.github.wdpm.pattern.structural.bridge;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public abstract class Shape {
    abstract void draw();

    /**
     * 持有一个Drawing类型实现的句柄
     */
    protected Drawing drawing;

    public Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    protected void drawLine(){
        drawing.drawLine();
    }

    protected void drawCircle(){
        drawing.drawCircle();
    }
}
