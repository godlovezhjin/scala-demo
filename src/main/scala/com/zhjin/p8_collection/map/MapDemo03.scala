package com.zhjin.p8_collection.map

//遍历
object MapDemo03 {

    def main(args: Array[String]): Unit = {
        val map = Map(("A", 1), ("B", "北京"), ("C", 3))

        //方式1
        for ((k, v) <- map) print(k + "==>" + v + "\t")
        println("\n-----------------")

        //方式2
        for (k <- map.keys) print(k + "===>" + map(k) + "\t")
        println("\n-----------------")

        //方式3
        for (v <- map.values) print(v + ", ")
        println("\n-----------------")

        //方式4
        for (item <- map) print(item + "  ") //item是Tuple2
        println()
        for (item <- map) print(item + ":" + item._1 + "-->" + item._2 + ";\t")
    }
}
