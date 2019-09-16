package com.zhjin.p6_trait.mixin


//动态混入
object MixinDemo01 {
    def main(args: Array[String]): Unit = {
        val obj1 = new MyCalss with MyTrait
        obj1.insert(1001)

        //new MyAbstractCalss1是一个匿名子类
        val obj2 = new MyAbstractCalss1 with MyTrait
        obj2.insert(1002)

        val obj3 = new MyAbstractCalss2 with MyTrait {
            override def sayHello(): Unit = {
                println("~~~hello scala~~~")
            }
        }
        obj3.insert(1003)
        obj3.sayHello()
    }
}


trait MyTrait {
    def insert(id: Int): Unit = {
        println("插入数据:" + id)
    }
}


class MyCalss {}

abstract class MyAbstractCalss1 {}

abstract class MyAbstractCalss2 {
    def sayHello()
}