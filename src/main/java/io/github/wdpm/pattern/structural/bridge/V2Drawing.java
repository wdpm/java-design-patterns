package io.github.wdpm.pattern.structural.bridge;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class V2Drawing implements Drawing {
    @Override
    public void drawLine() {
        System.out.println("V2Drawing drawLine");
    }

    @Override
    public void drawCircle() {
        System.out.println("V2Drawing drawCircle");
    }
}
