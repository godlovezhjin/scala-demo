package com.zhjin.p10_functional.recursion

//递归---阶乘
object Factorial {

    def main(args: Array[String]): Unit = {
        println(factorial(5))
    }

    def factorial(n: Int): Int = {
        if (n == 1) n
        else n * factorial(n - 1)
    }
}
