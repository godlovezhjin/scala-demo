package com.zhjin.p10_functional

//函数柯里化----求两个数的积
object CurryDemo01 {

    def main(args: Array[String]): Unit = {
        //传统写法
        def mul(x: Int, y: Int) = x * y

        println(mul(10, 10))


        //闭包写法
        def mulCurry(x: Int) = (y: Int) => x * y

        println(mulCurry(10)(10))


        //函数柯里化
        def mulCurry2(x: Int)(y: Int) = x * y

        println(mulCurry2(10)(10))
    }
}
