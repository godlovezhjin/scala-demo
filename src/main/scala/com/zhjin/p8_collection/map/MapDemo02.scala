package com.zhjin.p8_collection.map

import scala.collection.mutable

//可变映射
object MapDemo02 {

    def main(args: Array[String]): Unit = {
        //声明
        val map3 = mutable.Map("name" -> "李四", "age" -> 23, "gender" -> "女")
        val map4 = new mutable.HashMap[String, Any] //空映射

        //添加更新元素---key存在则更新,可以不存在则添加
        map3("name") = "wangwu"
        map3("dept") = "dev"
        map4 += ("name" -> "Java") += ("age" -> 12, "gender" -> "男")
        println(map3)
        println(map4)

        //删除元素---key不存在不会报错
        map4 -= ("gender", "dept")
        println(map4)

        val map5 = map4 - ("name")
        println("map4：" + map4 + "\t\t\tmap5：" + map5)
    }
}
