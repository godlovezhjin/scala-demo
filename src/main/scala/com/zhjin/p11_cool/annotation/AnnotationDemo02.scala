package com.zhjin.p11_cool.annotation

import scala.annotation.tailrec

//@tailrec注解标注是一个尾递归函数---可以优化
// 求序列元素的和
object AnnotationDemo02 {

    def main(args: Array[String]): Unit = {
        val ints = 1 to 1000
        println(s"ints = ${ints}")

        println(s"sum = ${sum(ints)}")
        println(s"sum2 = ${sum2(ints, 0)}")
    }

    //非尾递归----无法优化  序列为1 to 100000栈溢出
    def sum(xs: Seq[Int]): BigInt = {
        if (xs.isEmpty) 0 else xs.head + sum(xs.tail)
    }

    //尾递归---可以优化  序列为1 to 100000时正常运行
    @tailrec def sum2(xs: Seq[Int], partial: BigInt): BigInt = {
        if (xs.isEmpty) partial else sum2(xs.tail, xs.head + partial)
    }
}
