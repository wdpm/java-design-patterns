# Singleton
单例模式。
- 目的：希望对象只有一个实例。
- 参与者与协作者：Client对象只能通过getInstance方法获取Singleton实例。
- 实现步骤
  - 使用类私有静态成员变量，保存所需对象。
  - 使用公共静态方法，在成员为null时实例化这个类，返回实例。
  - 将构造函数设置为保护或者私有，避免直接实例化这个类。

## UML class diagram
![](../../images/Singleton.png)

## Java code implementation
单例模式有很多变体
- lazy init
- eager init
- double-checked locking for multi-thread
- inner class

### lazy init
```java
public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
```
- 特点：类加载时不初始化instance；在Client第一次调用getInstance()方法时，才进行判断并初始化
- 限制：不适用于多线程环境。下面是1000个线程同时调用SingletonLazy.getInstance()的结果：可以看到产生了四个不同的实例。
![](../../images/SingletonLazy-in-multi-thread.png)

### eager init
```java
public class SingletonEager {
    private static SingletonEager singleton = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return singleton;
    }
}
```
- 特点：类加载时已经初始化instance；在getInstance()中直接返回已经初始化的instance实例。
- 限制：可以保证唯一的实例，适用于多线程。但是初始开销增加。

### double-checked locking
```java
public class SingletonDoubleCheckLocking {
    private static SingletonDoubleCheckLocking instance;

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
```
- 限制：适用于多线程。但是性能开销较大，因为使用了类级别的同步。
