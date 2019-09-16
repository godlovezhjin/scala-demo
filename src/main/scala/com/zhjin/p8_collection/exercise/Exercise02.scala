package com.zhjin.p8_collection.exercise

//练习2---将"AAABBBCCCDDD"中各个字符使用映射集合,统计各个字母出现的次数
object Exercise02 {

    def main(args: Array[String]): Unit = {
        fun1()
        fun2()
        fun3()
        fun4()
    }

    //Java方式
    def fun1(): Unit = {
        import java.util._
        val map1: Map[Character, Integer] = new HashMap
        val sentence = "AAABBBBBCCCDDDDE"
        val arr: Array[Char] = sentence.toCharArray
        for (elem <- arr) {
            if (map1.containsKey(elem)) {
                map1.put(elem, map1.get(elem) + 1)
            } else {
                map1.put(elem, 1)
            }
        }
        println("map1 = " + map1)
    }


    //Scala方式
    def fun2(): Unit = {
        import scala.collection.mutable.{HashMap, Map}
        val map2: Map[Char, Int] = new HashMap
        val sentence = "AAABBBBBCCCDDDDE"
        val arr: Array[Char] = sentence.toCharArray
        for (elem <- arr) {
            if (map2.contains(elem)) {
                map2.put(elem, map2.get(elem).getOrElse(0) + 1)
            } else {
                map2.put(elem, 1)
            }
        }
        println("map2 = " + map2)
    }


    //fold方式----使用不可变map
    def fun3(): Unit = {
        val sentence = "AAABBBBBCCCDDDDE"
        val map3 = sentence.foldLeft(Map[Char, Int]())(charCount3)
        println("map3 = " + map3)

    }

    def charCount3(map: Map[Char, Int], c: Char): Map[Char, Int] = {
        map + (c -> (map.getOrElse(c, 0) + 1))
    }


    //fold方式---使用可变map----效率更高
    import scala.collection.mutable

    def fun4(): Unit = {
        val sentence = "AAABBBBBCCCDDDDE"
        val map4 = sentence.foldLeft(mutable.Map[Char, Int]())(charCount4)
        println("map4 = " + map4)
    }

    def charCount4(map: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {
        map += (c -> (map.get(c).getOrElse(0) + 1))
    }
}