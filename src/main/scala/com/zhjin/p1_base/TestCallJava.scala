package com.zhjin.p1_base

import com.zhjin.test.TestCallScala

/**
  * 测试Scala调Java Api
  */
object TestCallJava {

    def scalaFun(): Unit = {
        System.out.println("这是一个 Scala 函数......")
    }


    def main(args: Array[String]): Unit = {
        println(java.util.Arrays.asList("Java", "Scala"))
        TestCallScala.javaMethod()
    }
}
