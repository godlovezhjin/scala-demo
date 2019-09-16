package com.zhjin.p8_collection.array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {

    def main(args: Array[String]): Unit = {
        //创建
        var arr = new ArrayBuffer[String]()
        println("hashCode--1：" + arr.hashCode() + "\t" + arr.size)

        //添加元素
        arr.append("hadoop", "spack", "hbase", "sqoop")
        arr += "ZHJIN"
        println("hashCode--2：" + arr.hashCode() + "\t" + arr.size)

        //修改元素
        arr(0) = "hive"
        arr.update(3, "mod")
        println("hashCode--3：" + arr.hashCode() + "\t" + arr.size)

        //删除元素
        arr.remove(1)
        println("hashCode--4：" + arr.hashCode() + "\t" + arr.size)

        //遍历
        for (elem <- arr) {
            println(elem)
        }
        println(arr.mkString(" "))

        //追加返回新数组
        val arr2 = arr :+ "ZJ"
        println(arr2)
    }
}
