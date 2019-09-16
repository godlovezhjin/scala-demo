package com.zhjin.p3_fun

object Mothod2Function {

    def main(args: Array[String]): Unit = {
        val clazz = new MyClass()
        //调用方法
        println("调用方法：" + clazz.m_sum(2, 3))

        //方法转函数
        val f1 = clazz.m_sum _
        println("调用函数1：" + f1(2, 3))
        println(f1)

        /** ****************************************/

        //定义函数
        val f2 = (a: Int, b: Int, c: Int) => a + b + c
        //调用函数
        println("调用函数2：" + f2(1, 2, 3))
        println(f2)
    }
}


class MyClass {
    //方法
    def m_sum(a: Int, b: Int): Int = {
        return a + b
    }
}