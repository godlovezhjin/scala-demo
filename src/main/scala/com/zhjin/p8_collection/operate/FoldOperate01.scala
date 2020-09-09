package com.zhjin.p8_collection.operate

//折叠
object FoldOperate01 {

    def main(args: Array[String]): Unit = {
        //等价于 List(1, 2, 3, 4).reduce((a, b) => a * b)
        val mut: Int = List(2, 3, 4).fold(1)((a, b) => a * b)
        val mut2: Int = List(2, 3, 4).fold(1)(_ * _) //高级写法
        println("mut=" + mut + "\t mut2=" + mut2)

        //List(5, 1, 2, 3, 4).reduceLeft((a, b) => a - b)
        println("foldLeft：" + List(1, 2, 3, 4).foldLeft(5)((a, b) => a - b))
        println("foldLeft =" + List(5, 1, 2, 3, 4).reduceLeft((a, b) => a - b))

        //List(1, 2, 3, 4, 5).reduceRight((a, b) => a - b)
        println("foldRight：" + List(1, 2, 3, 4).foldRight(5)((a, b) => a - b))
        println("foldRight =" + List(1, 2, 3, 4, 5).reduceRight((a, b) => a - b))


        //折叠的简写
        println((1 /: List(2, 3, 4)) ((a, b) => a - b)) //等价于 list.foldLeft(1)(minus)
        println((10 /: List(2, 3, 4)) (minus)) //等价于 list.foldLeft(10)(minus)
        println((List(2, 3, 4) :\ 10) (minus)) //等价于 list.foldRight(10)(minus)
    }

    def minus(num1: Int, num2: Int): Int = {
        num1 - num2
    }
}