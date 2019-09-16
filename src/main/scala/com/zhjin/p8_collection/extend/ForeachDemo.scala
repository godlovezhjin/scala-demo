package com.zhjin.p8_collection.extend

//遍历
object ForeachDemo {

    def main(args: Array[String]): Unit = {
        val coll = List(1, 3, 5, 2, 4, 6)
        //方式1
        for (elem <- coll) print(elem + " ")
        println("\n==============================")

        //方式2
        coll.foreach(e => print(e + " "))
        println("\n==============================")

        //方式3
        coll.foreach(print(_)) //_表示每一个元素
        println("\n==============================")

        //方式4
        for (index <- 0 until coll.size) print(coll(index) + " ")
        println("\n==============================")

        //方式5
        for (index <- 0 to coll.size - 1) print(coll(index) + " ")
        println("\n==============================")

        //方式6
        print(coll.mkString(" "))
    }
}
