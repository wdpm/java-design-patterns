# Observer
> 定义对象间一种一对多的关系，当一个对象的状态改变时，所有依赖于它的对象都得到通知并自动更新。--《设计模式》

观察者模式。

## Java code implementation

Subject 物体接口。被观察的对象。

```java
public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String thing);
}
```

Observer 观察者接口。表示观察者类型。

```java
public interface Observer {
    void notify(String thing);
}
```

ASubject 具体的一个被观察者。

```java
public class ASubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(String thing) {
        observers.forEach(o -> o.notify(thing));
    }
}
```

AObserver 具体的一个观察者

```java
public class AObserver implements Observer {
    @Override
    public void notify(String thing) {
        System.out.println("thing is: "+thing);
        System.out.println("AObserver notify() called");
    }
}
```

测试代码

```java
public class ObserverTest {
    public static void main(String[] args) {
        ASubject aSubject = new ASubject();
        aSubject.registerObserver(new AObserver());
        aSubject.notifyObservers("something");
    }
}
```