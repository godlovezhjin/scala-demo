package com.zhjin.p8_collection.array

import scala.collection.mutable.ArrayBuffer

//scala集合与Java的List的转换
object ArrayToJavaList {

    def main(args: Array[String]): Unit = {
        //scala--->Java
        val arr = ArrayBuffer("1", "2", "3")
        import scala.collection.JavaConversions.bufferAsJavaList //bufferAsJavaList是一个隐式函数
        val javaList = new ProcessBuilder(arr).command()
        javaList.add("4")
        println("Java List：" + javaList) //输出 [1, 2, 3, 4]

        //Java--->scala
        import scala.collection.JavaConversions.asScalaBuffer //asScalaBuffer是一个隐式函数
        val jList = new java.util.ArrayList[String]()
        jList.add("zhjin")
        jList.add("kafka")
        val scalaArr: collection.mutable.Buffer[String] = jList
        scalaArr.append("flume")
        println("scala Arr：" + scalaArr) //输出(zhjin, kafka, flume)
    }
}
