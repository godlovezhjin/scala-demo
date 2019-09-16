package com.zhjin.p4_oop.myextends

object NoNameClassDemo {

    def main(args: Array[String]): Unit = {
        val obj = new Dept {
            override def test(): Unit = {
                println("~~~测试匿名子类~~~")
            }
        }
        obj.test()
    }
}

abstract class Dept {
    def test()
}
