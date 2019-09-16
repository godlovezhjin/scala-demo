package com.zhjin.p6_trait

object TrairDemo01 {
    def main(args: Array[String]): Unit = {
        val a = new A
        a.getConnect()
    }
}

//trait Serializable extends Any with java.io.Serializable
object D1 extends Serializable with Cloneable {
}

trait T {
    def getConnect()
}

class A extends T {
    override def getConnect(): Unit = {
        println("连接mysql")
    }
}
