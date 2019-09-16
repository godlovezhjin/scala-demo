package com.zhjin.p8_collection.list

import scala.collection.mutable.ListBuffer

object ListBufferDemo {

    def main(args: Array[String]): Unit = {
        //创建
        val lbuf = new ListBuffer[String]()
        val lbuf2 = ListBuffer[Any](1, 2, 3)

        //添加
        lbuf.append("Java", "Scala")
        lbuf2 += 4 += 5
        lbuf2 ++= lbuf
        val lbuf3 = lbuf2 ++ lbuf :+ 99

        //遍历
        for (elem <- lbuf2) print(elem + " ")
        println("\n--------------")

        //删除
        println(lbuf3.mkString("  "))
        lbuf3.remove(6, 100)
        println(lbuf3.mkString("  "))
    }
}
