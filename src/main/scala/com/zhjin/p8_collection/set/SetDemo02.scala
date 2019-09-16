package com.zhjin.p8_collection.set

import scala.collection.mutable

//可变
object SetDemo02 {

    def main(args: Array[String]): Unit = {
        val set2 = mutable.Set(1, 2, 2, 3, 4, "a")
        println(set2)

        //添加
        set2.+=("b")
        println(set2)

        //删除
        set2 -= (1, 2)
        set2.remove("a")
        println(set2)
    }
}
