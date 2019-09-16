package com.zhjin.p8_collection.operate

//规约化简---将返回结果作为第二次调用的第一个参数,继续递归调用
object ReduceOperate {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        val sum: Int = list.reduceLeft((a, b) => a + b)
        val mut: Int = list.reduceRight((a, b) => a * b)
        println(s"集合所以元素的和=${sum}  乘=${mut}")

        //reduce从左往右 <==> reduceLeft <==> ((1-2)-3)-4=-8
        println(List(1, 2, 3, 4).reduce((a, b) => a - b))
        //1-(2-(3-4))=-2
        println(List(1, 2, 3, 4).reduceRight((a, b) => a - b))

        //求最小值
        val min: Int = List(2, 4, 5, 6, 1, 8).reduce((a, b) => if (a < b) a else b)
        println("最小值 = " + min)

        //高级写法
        println(List(2, 4, 5).reduce(_ + _))
    }
}
