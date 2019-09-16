package com.zhjin.p10_functional.recursion

//递归求list的最大值
object Max {

    def main(args: Array[String]): Unit = {
        val list = List(1, 7, 99, 20, 50, 3, 38)
        println(max(list))
    }

    def max(list: List[Int]): Int = {
        if (list.isEmpty) throw new RuntimeException()
        else if (list.size == 1) list.head
        else {
            if (list.head > max(list.tail)) list.head
            else max(list.tail)
        }
    }
}
