package com.zhjin.p3_fun

//递归
object RecursionDemo {

    def test(n: Int): Unit = {
        if (n > 2) {
            test(n - 1)
        }
        println("n=" + n)
    }

    def test2(n: Int): Unit = {
        if (n > 2) {
            test2(n - 1)
        } else {
            println("n=" + n)
        }
    }

    def main(args: Array[String]): Unit = {
        test(4) //2 3 4
        test2(4)
    }
}
