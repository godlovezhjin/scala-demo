package com.zhjin.test;

import com.zhjin.p1_base.TestCallJava;
import scala.collection.Iterator;
import scala.io.BufferedSource;
import scala.io.Source;

/**
 * 测试Java调用Scala Api
 */
public class TestCallScala {

    public static void javaMethod() {
        System.out.println("这是一个 Java 方法......");
    }

    public static void main(String[] args) {
        BufferedSource file = Source.fromFile("E:\\tmp\\info.csv", "UTF-8");
        Iterator<String> lines = file.getLines();
        while (lines.hasNext()) {
            System.out.println(lines.next());
        }

        TestCallJava.scalaFun();
    }
}
