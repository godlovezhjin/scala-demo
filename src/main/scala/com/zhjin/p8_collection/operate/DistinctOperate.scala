package com.zhjin.p8_collection.operate

object DistinctOperate {

    def main(args: Array[String]): Unit = {
        val strs = List("Java", "Scala", "Scala", "Ptython")
        println(s"=============== distinct = ${strs.distinct.mkString(" ")}")


        val arr = Array(("Java", 99), ("Java", 99), ("Java", 90), ("Scala", 98), ("Scala", 90))
        println(s"元组默认去重 = ${arr.distinct.mkString(" ")}")


        val users = List(User(1L, "zhang3", 1), User(1L, "zhang3", 1), User(2L, "li4", 0), User(3L, "li4", 0))
        println(s"实体类默认去重 = ${users.distinct.mkString(" ")}")
    }


    sealed case class User(id: Long, name: String, gender: Int)

}
