package io.github.wdpm.pattern.structural.bridge;

/**
 * @Created evan
 * @Date 2020/4/17
 */
public class Client {
    public static void main(String[] args) {
        V1Drawing v1Drawing = new V1Drawing();
        V2Drawing v2Drawing = new V2Drawing();

        // Circle实例不知道具体的Drawing实现，只要是Drawing类型即可
        Shape circle1 = new Circle(v1Drawing);
        Shape circle2 = new Circle(v2Drawing);

        circle1.draw();
        circle2.draw();

        // Rectangle实例不知道具体的Drawing实现，只要是Drawing类型即可
        Shape rectangle1 = new Rectangle(v1Drawing);
        Shape rectangle2 = new Rectangle(v2Drawing);

        rectangle1.draw();
        rectangle2.draw();

        /*
            V1Drawing drawCircle
            V2Drawing drawCircle
            V1Drawing drawLine
            V2Drawing drawLine
         */
    }
}
