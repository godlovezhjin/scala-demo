package com.zhjin.p8_collection.operate

//分组---返回Map
object GroupByOperate {

    case class User(name: String, gender: Int)

    def main(args: Array[String]): Unit = {
        val list = List("Java", "Scala", "Python", "Shell", "JavaScript", "GoLang", "C", "C++", "C#", "SQL")

        val res1 = list.groupBy(s => s.length) //按长度分组
        val res2 = list.groupBy(_.head) //按首字母分组
        println(s"res1 = ${res1}\nres2 = ${res2}")


        //按性别分组
        val users = List(User("zhang3", 1), User("li4", 0), User("wang5", 0), User("zhao6", 1))
        val res = users.groupBy(_.gender)
        for ((k, v) <- res) println(k + "-->" + v)
    }
}
