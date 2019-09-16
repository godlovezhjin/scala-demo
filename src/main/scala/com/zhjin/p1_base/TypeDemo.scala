package com.zhjin.p1_base

//type关键字
object TypeDemo {

    def main(args: Array[String]): Unit = {
        type MyInt = Int //TODO type关键字---给类型取别名
        val num: MyInt = 10
        println(num, num.isInstanceOf[MyInt], num.isInstanceOf[Int])
    }
}
