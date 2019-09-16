package com.zhjin.p4_oop.myextends

object AbstractDemo {
    def main(args: Array[String]): Unit = {
    }
}

//抽象类
abstract class Animal {
    //抽象字段
    var name: String

    //普通字段
    var age: Int = 4

    //抽象方法
    def cry()
}