package com.zhjin.p8_collection.operate

//拉链
object ZipOperte {

    def main(args: Array[String]): Unit = {
        val list1 = List(1, 2, 3)
        val list2 = List(4, 5, 6)
        val res1 = list1.zip(list2)
        val res2 = list2.zip(list1)
        println(s"res1=${res1}") //res1=List((1,4), (2,5), (3,6))
        println(s"res2=${res2}") //res2=List((1,4), (2,5), (3,6))

        val set = Set("北京", "上海", "深圳", "广州")
        val list = List(1, 2, 3, 4, 5, 6)
        val res = set.zip(list)
        println("城市排名：" + res)
        for (elem <- res) println(elem._1 + ":" + elem._2)
    }
}
