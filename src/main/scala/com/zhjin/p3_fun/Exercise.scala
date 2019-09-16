package com.zhjin.p3_fun

object Exercise {

    //99乘法表
    def print99(): Unit = {
        for (i <- 1 to 9) {
            for (j <- 1 to i) {
                print(s"$j * $i = ${i * j}\t")
            }
            println()
        }
    }

    //递归求x的n次方
    def power(x: Double, n: Int): Double = {
        if (n == 0) 1
        else if (n > 0) x * power(x, n - 1)
        else 1 / power(x, -n)
    }

    def main(args: Array[String]): Unit = {
        // print99()
        println(power(2, -2))
    }
}
