package io.github.wdpm.pattern.creational.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SingletonLazyInMultiThreadClient {
    public static void main(String[] args) throws InterruptedException {
        List<SingletonLazy> singletonLazies = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> singletonLazies.add(SingletonLazy.getInstance()));
            thread.start();
        }

        // give enough wait time for sub-thread to finish
        Thread.sleep(12000);
        System.out.println(hasDuplicates(singletonLazies));
    }

    public static boolean hasDuplicates(List<?> arrayList) {
        HashSet<?> hashSet = new HashSet<>(arrayList);
        return arrayList.size() != hashSet.size();
    }

}
