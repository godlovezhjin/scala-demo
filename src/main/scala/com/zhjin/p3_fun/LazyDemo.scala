package com.zhjin.p3_fun

//懒加载
object LazyDemo {
    def sum(a: Int, b: Int): Int = {
        println("---------函数sum被执行了----------") //2
        a + b
    }

    def main(args: Array[String]): Unit = {
        lazy val res = sum(2, 3)
        println("************************") //1
        println("res = " + res) //3
    }
}
