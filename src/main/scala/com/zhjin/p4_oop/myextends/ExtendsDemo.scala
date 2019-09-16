package com.zhjin.p4_oop.myextends

object ExtendsDemo {
    def main(args: Array[String]): Unit = {
        val stu = new Student1
        stu.fun()
    }
}


class Person1 {
    val name: String = ""

    def fun(): Unit = {
        println("~~~Person fun~~~")
    }

    def f2(): Unit = {
        println("~~~Person f2~~~")
    }
}

class Student1 extends Person1 {
    override def fun(): Unit = {
        println("~~~Student fun~~~")
        super.fun()
        f2()
    }
}
