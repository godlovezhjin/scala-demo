package com.zhjin.p8_collection.operate

/**
  * foldLeft 做两个map的合并 putAll()
  */
object FoldOperate02 {

    def main(args: Array[String]): Unit = {
        val map1 = Map("k1" -> 1, "k2" -> 2)
        val map2 = Map("k3" -> 3, "k4" -> 4)


        val map3 = map1.foldLeft(map2)((map, kv) => map + kv)
        println(s"=======> map3: ${map3}")


        val map4 = (map1 /: map2) { case (map, (k, v)) => map + (k -> v) }
        println(s"=======> map4: ${map4}")
    }
}
