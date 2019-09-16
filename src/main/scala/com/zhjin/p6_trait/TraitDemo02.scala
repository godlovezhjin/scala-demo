package com.zhjin.p6_trait

object TraitDemo02 {
    def main(args: Array[String]): Unit = {
        new T3 {
            override val name: String = "小李"

            override def m1(): Unit = {
                println("~~~T3的匿名子类~~~", name)
            }
        }.m1()
    }
}

trait T3 {
    val name: String
    val age: Int = 18

    def m1()

    def m2(): Unit = {
        println("~~~hello~~~")
    }
}

class C3 extends T3 {
    override val name: String = ""

    override def m1(): Unit = {
        println("~~~C3 m1~~~")
    }
}
