package com.zhjin.p8_collection.operate

import scala.collection.immutable.Queue

/**
  * flatten:压平
  *
  * flatMap = map + flatten
  */
object FlattenOperate {

    def main(args: Array[String]): Unit = {
        //flatten
        val ints: List[Any] = List(List("a", "b", "c"), 1 to 3, Queue("12.4", "11.3")).flatten
        println(s"flatten：${ints}") //List(a, b, c, 1, 2, 3, 12.4, 11.3)


        //拆分单词
        val lines = List("hello world", "scala python", "hive hbase hadoop")
        val list: List[Array[String]] = lines.map(_.split(" "))
        println(s"map：${list}")
        println(s"flatten：${list.flatten}")

        println(s"flatMap：${lines.flatMap(_.split(" "))}")
    }
}
