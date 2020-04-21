package io.github.wdpm.pattern.behavioral.strategy;

import com.sun.istack.internal.NotNull;

/**
 * @author evan
 * @date 2020/4/21
 */
public class Client {
    public static void main(String[] args) throws Exception {

        new UseContext(new ConcreteStrategy1()).execute();

        new UseContext(new ConcreteStrategy2()).execute();

        String type = "2";
        Strategy strategyByType = StrategyFactory.getInstance()
                                                 .getStrategyByType(type);
        new UseContext(strategyByType).execute();
    }

    public static class StrategyFactory {
        // singleton
        private StrategyFactory() {
        }

        public static StrategyFactory getInstance() {
            return StrategyFactoryInstance.instance;
        }

        private static class StrategyFactoryInstance {
            private static final StrategyFactory instance = new StrategyFactory();
        }

        public Strategy getStrategyByType(@NotNull String type) throws Exception {
            switch (type) {
                case "1":
                    return new ConcreteStrategy1();
                case "2":
                    return new ConcreteStrategy2();
                default:
                    throw new Exception("Unsupported type: " + type);
            }
        }
    }
}
