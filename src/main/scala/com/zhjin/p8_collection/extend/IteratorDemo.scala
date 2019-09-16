package com.zhjin.p8_collection.extend

//迭代器
object IteratorDemo {

    def main(args: Array[String]): Unit = {
        //集合转迭代器
        val iterator: Iterator[Int] = List(1, 2, 3, 4, 5).iterator
        while (iterator.hasNext) {
            val value = iterator.next()
            println("value=" + value)
        }

        val iterator2: Iterator[Int] = Array(1, 2, 3, 4, 5).iterator
        for (enum <- iterator2) {
            println("enum=" + enum)
        }


        //迭代器转集合
        val its: Iterator[Int] = Iterator(1, 3, 5, 2, 4, 6)
        val array: Array[Int] = its.toArray
        val arr: Array[Int] = array.sorted
        println(arr.mkString(" "))
    }
}
