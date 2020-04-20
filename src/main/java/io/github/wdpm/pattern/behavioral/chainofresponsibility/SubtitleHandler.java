package io.github.wdpm.pattern.behavioral.chainofresponsibility;

/**
 * @author evan
 * @date 2020/4/19
 */
public class SubtitleHandler extends VideoHandler {

    @Override
    public void handle(Video video) {
        System.out.println("Add subtitle to video...");

        this.invokeNext(video);
    }

}
