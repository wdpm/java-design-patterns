package io.github.wdpm.pattern.structural.bridge;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class V1Drawing implements Drawing {
    @Override
    public void drawLine() {
        System.out.println("V1Drawing drawLine");
    }

    @Override
    public void drawCircle() {
        System.out.println("V1Drawing drawCircle");
    }
}
