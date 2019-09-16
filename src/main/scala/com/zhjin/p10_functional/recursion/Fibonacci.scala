package com.zhjin.p10_functional.recursion

//斐波那契
object Fibonacci {

    def main(args: Array[String]): Unit = {
        var count = 0

        println(fibonacci(20))
        println("count = " + count)

        //两次调用,递归写法效率较低,用迭代优化
        //优化：https://blog.csdn.net/dadai/article/details/50209511
        def fibonacci(n: Long): Long = {
            count += 1
            if (n == 1 || n == 2) 1
            else fibonacci(n - 2) + fibonacci(n - 1)
        }
    }
}
