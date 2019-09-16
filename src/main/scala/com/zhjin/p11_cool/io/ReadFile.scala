package com.zhjin.p11_cool.io

import scala.io.Source

//读取文件
object ReadFile {

    def main(args: Array[String]): Unit = {
        val path = "E:\\DevWorkspace\\MyScala\\scala-demo\\src\\main\\scala\\com\\zhjin\\p11_high\\package_info.scala"

        //获取文件流对象 BufferedSource---继承了Iterator[Char]
        val file = Source.fromFile(path, "UTF-8")
        //文件流迭代器
        val lines = file.getLines

        //读文件
        println("==================================方式1=====================================")
        for (line <- lines) println(line)

        println("==================================方式2=====================================")
        lines.foreach(println(_))

        println("==================================方式3=====================================")
        println(lines.mkString("\n"))

        println("=================================过滤读取====================================")
        println(lines.filter(line => line.contains("*")) mkString ("\n"))

        //关闭文件流
        file.close


        println("=======================================================================")
        println(s"file.codec = ${file.codec}")
        println(s"file.getClass = ${file.getClass}")
        println(s"lines.getClass = ${lines.getClass}")
        println("=======================================================================")


        //按格式读取
        val file2 = Source.fromFile("E:/tmp/info.csv", "UTF-8")
        val arr = file2.mkString.split(",")
        println(arr.mkString("\t"))
    }
}
