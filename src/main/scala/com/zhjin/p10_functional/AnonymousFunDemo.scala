package com.zhjin.p10_functional

//匿名函数
object AnonymousFunDemo {

    def main(args: Array[String]): Unit = {
        val triple = (x: Double) => 3 * x
        println("类型：" + triple)
        println(triple(3))

        val res = test(dToInt, mul2, 5.2)
        println(s"res = ${res}")
    }

    //高阶函数
    def test(f: Double => Int, f2: Double => Double, n: Double): Int = {
        f(f2(n))
    }

    def dToInt(n: Double): Int = {
        n.toInt
    }

    def mul2(d: Double): Double = {
        d * 2
    }
}
