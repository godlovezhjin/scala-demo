package com.zhjin.p11_cool.regex

import scala.util.matching.Regex

//正则表达式
object RegexDemo01 {

    def main(args: Array[String]): Unit = {
        //实例化正则对象---方式1
        val pattern1 = new Regex("(S|s)cala")

        //实例化正则对象---方式2
        val pattern2 = "(S|s)cala".r
        println(pattern1.getClass + "\t" + pattern2.getClass) //scala.util.matching.Regex

        val str = "Scala is scalable and cool"

        println((pattern1 findAllIn str).mkString(","))
        println((pattern2 findAllIn str).mkString(","))
    }
}
