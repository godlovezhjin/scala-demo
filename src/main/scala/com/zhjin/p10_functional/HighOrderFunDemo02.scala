package com.zhjin.p10_functional

//高阶函数
object HighOrderFunDemo02 {

    def main(args: Array[String]): Unit = {
        //普通函数
        def minus(x: Double) = x - 7


        //高阶函数---参数为函数类型
        def hf1(f: Double => Double) = f(10)

        val res1 = hf1(minus)
        println(s"res1 = $res1")


        //高阶函数---返回函数类型
        def hf2(x: Int) = (y: Int) => x + y

        val res2 = hf2(3)
        println(s"res2 = $res2")
        val res3 = res2(5)
        println(s"res3 = $res3")
        println(s"柯里化写法 = ${hf2(3)(5)}")
    }
}
