package com.zhjin.demo

/**
  * 阶乘
  */
object Factorial {

    def main(args: Array[String]): Unit = {
        val n = 3
        println(factorial01(n))
        println(factorial02(n))
        println(factorial02_2(n))
        println(factorial03(n))
        println(factorial03_2(n))
        println(factorial04(n))
    }

    //方式1---递归
    def factorial01(n: Int): Int = {
        if (n == 1) 1
        else n * factorial01(n - 1)
    }

    //方式2---规约化简
    def factorial02(n: Int): Int = {
        (1 to n).reduce((x, y) => x * y)
    }

    //方式2---规约化简
    def factorial02_2(n: Int): Int = {
        1 to n reduceLeft (_ * _)
    }

    //方式3---循环
    def factorial03(n: Int): Int = {
        var res = 1
        for (x <- 1 to n) {
            res = x * res
        }
        res
    }

    //方式3---循环
    def factorial03_2(n: Int): Int = {
        var res = 1
        var x = 1
        while (x <= n) {
            res = x * res
            x += 1
        }
        res
    }

    //方式4---模式匹配 + 递归
    def factorial04(n: Int): Int = {
        n match {
            case 1 => 1
            case _ => n * factorial04(n - 1)
        }
    }
}
