package com.zhjin.p8_collection.map

//不可变映射
object MapDemo01 {

    def main(args: Array[String]): Unit = {
        //声明
        val map1 = Map("name" -> "张三", "age" -> 18, "gender" -> "男")
        val map2 = Map(("name", "zhjin"), ("age", 23))

        //取值
        //方式1--不存在则报错
        println(map1("name"))
        //方式2
        if (map1.contains("age")) {
            println("值存在,为" + map1("age"))
        } else {
            println("值不存在")
        }
        //方式3---不存在会报错
        val v = map1.get("age").get
        println("v = " + v)
        //方式4---不存在则取getOrElse的默认值
        val v2 = map1.get("age1").getOrElse(10)
        val v22 = map1.getOrElse("age1", 10)
        println(s"v2=${v2}  v22=${v22}")

        //修改值返回新的map
        val map5 = map2.updated("name", "zhang3")
        println(map5)
        //根据k删除返回新map
        val map6 = map1 - ("name")
        println("map4：" + map1 + "\t\t\tmap5：" + map6)
    }
}
