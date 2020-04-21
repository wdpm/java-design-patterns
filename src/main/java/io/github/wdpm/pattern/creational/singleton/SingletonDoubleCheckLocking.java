package io.github.wdpm.pattern.creational.singleton;

/**
 * @author  evan
 * @date 2020/4/18
 */
public class SingletonDoubleCheckLocking {
    // avoid do this because of JVM instructions re-order issue
    // private static SingletonDoubleCheckLocking instance;

    // use volatile
    private volatile static SingletonDoubleCheckLocking instance;

    private SingletonDoubleCheckLocking() {
    }

    public static SingletonDoubleCheckLocking getInstance() {
        // 先进行常规null判断
        if (instance == null) {
            //同步所有线程，这时才能看到所有线程的最新结果
            synchronized (SingletonDoubleCheckLocking.class) {
                // 如果所有线程都还没有创建instance，那就创建
                if (instance == null) {
                    instance = new SingletonDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
