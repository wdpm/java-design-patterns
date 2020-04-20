package io.github.wdpm.pattern.behavioral.chainofresponsibility;

/**
 * 责任链测试
 *
 * @author evan
 * @since 2020/4/19
 */
public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Video           video           = new Video();
        EffectHandler   effectHandler   = new EffectHandler();
        AudioHandler    audioHandler    = new AudioHandler();
        SubtitleHandler subtitleHandler = new SubtitleHandler();

        effectHandler.setNextHandler(audioHandler)
                     .setNextHandler(subtitleHandler)
                     .setNextHandler(null);

        // video 传入第一个处理者即可
        effectHandler.handle(video);

        /*
        Add effect to video...
        Add audio to video...
        Add subtitle to video...
         */
    }
}
