package com.zhjin.p9_match.extend

//for循环正中的模式匹配
object MatchForDemo {

    def main(args: Array[String]): Unit = {
        val map = Map("A" -> 1, "B" -> 2, "C" -> 1)
        //全遍历
        for ((k, v) <- map) print(s"<$k : $v>\t\t")
        println("\n========================")


        //for守卫写法
        for ((k, v) <- map if v == 2) print(s"<$k : $v>\t\t")
        println("\n========================")


        //模式匹配写法
        for ((k, 2) <- map) print(s"<$k : 2>\t\t")
        println("\n========================")
    }
}
