package com.zhjin.p8_collection.exercise

/**
  * wordcount---
  * 要求: val lines = List("zhjin han hello ", "scala han aaa aaa aaa ccc ddd uuu")
  * 使用映射集合,list中各个单词出现的次数,并按出现次数排序
  * 提示：1.扁平化 2.map (han,1) (aaa, 1) 3.分组  4.map可以统计
  */
object WordCount {

    def main(args: Array[String]): Unit = {
        fun1()
        fun2()
    }


    //方式1
    def fun1(): Unit = {
        val lines = List("hello scala zhjin", "scala python zhjin hadoop", "hive zhjin hbase sqoop hadoop")
        val map1 = lines.flatMap(s => s.split(" ")).foldLeft(Map[String, Int]())(wc)
        println("方式1：" + map1)
    }

    def wc(map: Map[String, Int], word: String): Map[String, Int] = {
        map + (word -> (map.getOrElse(word, 0) + 1))
    }


    //方式2
    def fun2(): Unit = {
        val lines = List("hello scala zhjin", "hello zhjin hadoop", "hive hbase hadoop")
        //1.扁平打散
        val words = lines.flatMap(_.split(" ")) //val words = lines.flatMap(s => s.split(" "))
        println("words = " + words)
        //2.map--封装元组
        val maps = words.map((_, 1)) //val maps = words.map(w => (w, 1))
        println("maps = " + maps)
        //3.分组
        val group = maps.groupBy(_._1) //val res3 = maps.groupBy((x: (String, Int)) => x._1)
        println("group = " + group)
        //4.统计元素个数
        val reduce = group.map(x => (x._1, x._2.size)) // val res4 = group.map((x: (String, List[(String, Int)])) => (x._1, x._2.size))
        println("reduce = " + reduce)
        //5.排序--倒序
        val result = reduce.toList.sortBy(_._2).reverse //val res = reduce.toList.sortBy((x: (String, Int)) => x._2).reverse
        println("方式2：" + result)


        //一步到位
        println("链式写法：" + lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(e => (e._1, e._2.size)).toList.sortBy(-_._2))
    }
}
