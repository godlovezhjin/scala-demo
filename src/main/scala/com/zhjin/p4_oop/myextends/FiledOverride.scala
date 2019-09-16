package com.zhjin.p4_oop.myextends

//遵守动态绑定机制,本质上调用的XXX()方法
object FiledOverride {

    def main(args: Array[String]): Unit = {
        val obj1: AAA = new BBB
        val obj2: BBB = new BBB
        println(obj1.age + "\t" + obj2.age) //20  20
    }
}


class AAA {
    val age: Int = 10

    def test(): String = {
        "hadoop"
    }
}

class BBB extends AAA {
    override val age: Int = 20

    //属性重写方法
    override val test = "spark"
}