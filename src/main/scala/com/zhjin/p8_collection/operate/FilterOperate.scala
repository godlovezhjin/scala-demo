package com.zhjin.p8_collection.operate

//过滤
object FilterOperate {

    def main(args: Array[String]): Unit = {
        val list = List("Java", "Python", "Scala").filter(s => s.contains("a"))
        println(list)
    }
}
