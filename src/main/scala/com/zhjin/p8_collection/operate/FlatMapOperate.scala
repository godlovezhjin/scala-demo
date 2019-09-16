package com.zhjin.p8_collection.operate


/**
  * 扁平化：
  * flatMap---扁平化----对集合进行map后,若有子集合则继续遍历放到一个新集合中(只会压平最外层)
  */
object FlatMapOperate {

    def main(args: Array[String]): Unit = {
        //map VS flatMap
        val list = List("Java", "Scala", "MapReduce")
        println("map：" + list.map(s => s.toLowerCase))
        println("flatMap：" + list.flatMap(s => s.toUpperCase))
        println("========================================")


        //拆分单词
        val lines = List("hello world", "scala python", "hive hbase hadoop")
        println(s"words = ${lines.flatMap(_.split(" "))}")

        val arrs = lines.map(_.split(" "))
        //arrs是一个2维数组 Array(Array("hello","world"), Array("scala","python"), Array("hive","hbase","hadoop"))
        for (arr <- arrs) {
            for (elem <- arr) print(elem + " ")
            println()
        }


        println("===================map  VS  flatMap=====================")
        val rdd = Array("a b c", "1 2 3")
        val array = rdd.flatMap(_.split(" ")) //Array("a" "b" "c", "1" "2" "3")
        val arrays1 = rdd.map(_.split(" ")) //Array(Array(a, b, c), Array(1, 2, 3))
        val arrays2 = rdd.flatMap { x => val rr = x.split(" "); Array(rr) } //Array(Array(a, b, c), Array(1, 2, 3))

        val arrayss = rdd.map { x => val rr = x.split(" "); Array(rr) } //三维数组Array(Array(Array(a, b, c)), Array(Array(1, 2, 3)))


        println(s"array = ${array.mkString(" ")}")
        for (arr <- arrays1) {
            for (elem <- arr) print(elem + " ")
            println()
        }
        println("-------")

        for (arr <- arrays2) {
            for (elem <- arr) print(elem + " ")
            println()
        }
        println("-------")

        for (arrs <- arrayss) {
            for (arr <- arrs) {
                for (elem <- arr) print(elem + " ")
                println()
            }
        }
    }
}
