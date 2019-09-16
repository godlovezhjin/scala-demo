package com.zhjin.p8_collection.map

import scala.collection.immutable.HashMap

//Option有两个子类Some和None
object OptionDemo {

    def main(args: Array[String]): Unit = {
        val map = Map("name" -> "张三", "age" -> 18, "gender" -> "男")
        val o: Option[Any] = map.get("name")
        println(o)
        val v: Any = o.get
        println(v)

        val map1 = new HashMap[String, Any]()
        val op = map1.get("name")
        println(op)


        println(Option(1).get) //1
        println(Some(1).get) //1
        println(Some(1).getOrElse(10)) //1
        println(None.getOrElse(10)) //10
    }
}
