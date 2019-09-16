package com.zhjin.p3_fun

/**
  * 和python一样,可以设置默认值,也可以传指定的参数
  */
object FunDefaultParam {

    def fun1(a: Int = 1, b: Int) = {
        a + b
    }

    def fun2(a: Int, b: Int = 10) = {
        a + b
    }

    def main(args: Array[String]): Unit = {
        println(fun1(b = 2))
        println(fun1(2, 3))

        println(fun2(3))
        println(fun2(a = 3))
        println(fun2(3, 100))
    }
}
