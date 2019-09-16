package com.zhjin.p11_cool.reflex

import com.zhjin.p11_cool.reflex.TypeDemo.Index
import scala.collection.mutable.HashMap

//类型别名
class Document {
    def play(x: Index): Unit = {
        println("play方法执行 x = " + x)
    }
}


object TypeDemo extends App {

    type Index = HashMap[String, (Int, Int)]

    val d = new Document

    val index = new Index
    index.put("Scala", (1, 2))
    index.put("Java", (10, 20))

    d.play(index)
}


