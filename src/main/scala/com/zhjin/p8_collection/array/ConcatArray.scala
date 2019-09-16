package com.zhjin.p8_collection.array

//合并数组
object ConcatArray {

    def main(args: Array[String]): Unit = {
        val arr1: Array[Any] = Array(1, 2, 3)
        val arr2: Array[Any] = Array("a", "b", "c", 2)

        val arr3: Array[Any] = Array.concat(arr1, arr2)
        println(arr3.mkString(" "))
    }
}
