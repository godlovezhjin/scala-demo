package com.zhjin.p3_fun

//斐波那契数列 1 1 2 3 5 8 13
object Fibonacci {
    def fibonacci(n: Int): Int = {
        if (n <= 2) {
            1
        } else {
            fibonacci(n - 2) + fibonacci(n - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        println(fibonacci(7))
    }
}
