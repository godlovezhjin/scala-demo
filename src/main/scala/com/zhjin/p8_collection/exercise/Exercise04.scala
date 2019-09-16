package com.zhjin.p8_collection.exercise

object Exercise04 {

    def main(args: Array[String]): Unit = {
        println(factorial(6))
        println(factorial2(6))
    }

    //阶乘
    def factorial(n: Int): Int = {
        (1 to n).reduceLeft(_ * _)
    }

    //阶乘
    def factorial2(n: Int): Int = {
        (1 to n).reduceLeft((x, y) => x * y)
    }
}
