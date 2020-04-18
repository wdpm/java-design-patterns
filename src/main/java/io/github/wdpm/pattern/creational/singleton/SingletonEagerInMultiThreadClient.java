package io.github.wdpm.pattern.creational.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Created evan
 * @Date 2020/4/18
 */
public class SingletonEagerInMultiThreadClient {
    public static void main(String[] args) throws InterruptedException {
        List<SingletonEager> singletonEagers = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> singletonEagers.add(SingletonEager.getInstance()));
            thread.start();
        }

        // give enough wait time for sub-thread to finish
        Thread.sleep(12000);
        System.out.println(hasDuplicates(singletonEagers));//true
    }

    public static boolean hasDuplicates(List<?> arrayList) {
        HashSet<?> hashSet = new HashSet<>(arrayList);
        return arrayList.size() != hashSet.size();
    }

}
