package com.zhjin.p8_collection.list

object ListDemo {

    def main(args: Array[String]): Unit = {
        println("创建空集合：" + Nil)
        println("创建列表：" + (1 :: 2 :: 3 :: Nil))

        val list = List(1, 2, 3, true, Nil, null)
        //基本操作
        println(list.mkString("\t"))
        println("取值：" + list(0) + "  " + list.apply(1))
        println("第一个值：" + list.head)
        println("除第一个值：" + list.tail)
        println("是否为空：" + list.isEmpty)

        //修改
        val list_2 = list.updated(0, 9)
        println("updated：" + list_2)

        //追加---产生新列表
        val list2 = List(1, 2, 3)
        val list3 = List(4, 5)
        println(Nil :+ 10 :+ "hello")
        println("hello" :+ list2 +: "abc")
        println(4 :: 5 :: list2 :: Nil) //List(4, 5, List(1, 2, 3))
        //连接列表
        println(list2 ::: list3) //List(1, 2, 3, 4, 5)
        println(List.concat(list2, list3))
    }
}