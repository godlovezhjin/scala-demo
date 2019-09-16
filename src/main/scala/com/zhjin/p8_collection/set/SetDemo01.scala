package com.zhjin.p8_collection.set

//不可变
object SetDemo01 {

    def main(args: Array[String]): Unit = {
        var set1 = Set[Int](1, 2, 2, 3)
        println(set1)
        println("max = " + set1.max)

        //添加
        set1 += (5, 6)
        println(set1)

        //删除
        set1 -= (5, 6, 1)
        println(set1)

        //遍历
        for (elem <- set1) print(elem + " ")
    }
}
