package io.github.wdpm.pattern.behavioral.chainofresponsibility;

/**
 * @author evan
 * @since 2020/4/19
 */
public class EffectHandler extends VideoHandler {

    @Override
    public void handle(Video video) {
        System.out.println("Add effect to video...");

        this.invokeNext(video);
    }
}
