package com.zhjin.p11_cool.reflex

/**
  * 中置类型：是一个带有两个类型参数的类型，以中置语法表示，比如可以将Map[String, Int]
  */
object IntermediateType {

    def main(args: Array[String]): Unit = {
        val map1: String Map Int = Map("Fred" -> 42)
        val map2: Map[String, Int] = Map("Fred" -> 42)

        println(s"map1 = ${map1}")
        println(s"map2 = ${map2}")
    }
}
