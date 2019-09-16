package com.zhjin.p10_functional

//测试高阶函数
object HighOrderFunDemo01 {

    def main(args: Array[String]): Unit = {
        //测试有参高阶函数
        val res = test(sum, 6.0) // 12.0
        println("res=" + res)

        //测试无参高阶函数------注意调高阶函数传入函数时不能带(),只传函数名
        test2(sayHello)

        //测试 _
        val my = myPrint _ //myPrint不会执行, my表示一个函数,需要手动执行
        println("my = " + my)
        my() //手动执行函数

        println("-----------------------------")

        val my2 = myPrint //myPrint会执行, my表示函数的返回值(变量)
        println("my2 = " + my2)
    }

    /**
      * test是一个高阶函数
      *
      * @param f 表示一个接收double返回double的函数
      * @param n 普通参数
      * @return
      */
    def test(f: Double => Double, n: Double) = {
        f(n) //执行传入的函数
    }

    def sum(d: Double): Double = {
        println("sum函数执行了~~~")
        d * 2
    }

    def myPrint(): Unit = {
        println("hello~~~")
    }

    /**
      * test2是一个高阶函数
      *
      * @param f 表示一个无参无返回的函数---()不能省略
      */
    def test2(f: () => Unit): Unit = {
        f()
    }

    def sayHello(): Unit = {
        println("Hello Scala...")
    }
}
