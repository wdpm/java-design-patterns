package io.github.wdpm.pattern.behavioral.chainofresponsibility;

/**
 * @author evan
 * @since 2020/4/19
 */
public abstract class VideoHandler {

    abstract void handle(Video video);

    protected VideoHandler nextHandler;

    protected void invokeNext(Video video) {
        if (nextHandler != null) {
            nextHandler.handle(video);
        }
    }

    /**
     * set nextHandler and return nextHandler in order to support chain call.
     *
     * <pre>
     * example: effectHandler.setNextHandler(audioHandler).setNextHandler(subtitleHandler).setNextHandler(null);
     * </pre>
     *
     * @param nextHandler VideoHandler type
     * @return nextHandler
     */
    public VideoHandler setNextHandler(VideoHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
