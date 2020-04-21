package io.github.wdpm.pattern.behavioral.strategy;

/**
 * 策略使用场景
 *
 * @author evan
 * @date 2020/4/21
 */
public class UseContext {
    private Strategy strategy;

    /**
     * 将策略类型参数传入
     *
     * @param strategy
     */
    public UseContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 使用策略的方法
     */
    public void execute() {
        strategy.algorithm();
    }
}
