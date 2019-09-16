package com.zhjin.p8_collection.set

//集合的运算
object SetDemo03 {

    def main(args: Array[String]): Unit = {
        val s1 = Set(1, 2, 3, 4, 5)
        val s2 = Set(1, 3, 5, 7, 9)

        println("交集：" + (s1 & s2))
        println("并集(合并两set)：" + (s1 ++ s2))
        println("差集：" + (s1 -- s2) + "\t或：" + (s1 &~ s2))
    }
}
