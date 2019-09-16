package com.zhjin.p8_collection.list

//通过tabulate函数创建list
object ListDemo03 {

    def main(args: Array[String]): Unit = {
        //通过给定的函数创建5个元素
        val squares = List.tabulate(6)(n => n * n)
        println("一维: " + squares)

        // 创建二维列表
        val mul = List.tabulate(2, 3)(_ * _)
        println("多维: " + mul)
    }
}
