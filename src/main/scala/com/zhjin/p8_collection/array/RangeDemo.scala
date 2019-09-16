package com.zhjin.p8_collection.array

//区间数组
object RangeDemo {

    def main(args: Array[String]): Unit = {
        val ran = 1 to 5 //前闭后闭
        println(ran)
        val ran2 = 1 until 5 //前闭后开
        println(ran2)

        val range = Range(1, 5) //前闭后开
        println(ran)
        val range2 = Range(10, 0, -2)
        println(range2)

        val arr = Array.range(1, 10, 2) //前闭后开
        println(arr.mkString(" "))
    }
}
