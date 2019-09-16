package com.zhjin.p2_flow

object Exercise {

    //倒序输出----10...1
    def for_reverse(): Unit = {
        for (e <- 1 to 10 reverse) {
            print(e + "\t")
        }
        println()

        for (e <- 1 to 10; j = 11 - e) {
            print(j + "\t")
        }
        println()

        (1 to 10).reverse.foreach(print)
    }

    //将hello的个字符转成Long求乘机
    def hello(): Unit = {
        var s: Long = 1L
        for (e <- "hello") {
            s *= e.toLong
        }
        println(s)

        var res = 1L
        "hello".foreach(res *= _.toLong) // _表示每一个元素
        println(res)
    }

    //递归求一个字符串uncode编码的积
    def f1(str: String): Long = {
        if (str.length == 1) return str.charAt(0).toLong
        else str.charAt(0).toLong * f1(str.drop(1))
    }


    def main(args: Array[String]): Unit = {
        // var res = 0
        // List("1", "3", "5", "7", "9").foreach(res += _.toInt)
        // println(res)

        // for_reverse
        // hello
        println(f1("hello"))
    }
}
