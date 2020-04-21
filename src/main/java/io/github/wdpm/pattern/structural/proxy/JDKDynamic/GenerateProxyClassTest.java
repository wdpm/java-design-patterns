package io.github.wdpm.pattern.structural.proxy.JDKDynamic;

import io.github.wdpm.pattern.structural.proxy.RealSubject;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用ProxyGenerator模拟生成代理类
 *
 * @author evan
 * @date 2020/4/21
 */
public class GenerateProxyClassTest {
    public static void main(String[] args) throws IOException {
        byte[] classFile = ProxyGenerator.generateProxyClass("TestProxyGen",
                RealSubject.class.getInterfaces());
        try (FileOutputStream fos
                     = new FileOutputStream(new File("./TestProxyGen.class"))) {
            fos.write(classFile);
            fos.flush();
        }
    }
}
