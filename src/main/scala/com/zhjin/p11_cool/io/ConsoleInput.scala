package com.zhjin.p11_cool.io

import java.util.Scanner

import scala.io.StdIn

//控制台输入
object ConsoleInput {

    def main(args: Array[String]): Unit = {
        val in = StdIn.readLine("请输入字符串：")

        print("请输入整数：")
        val in2 = StdIn.readInt()

        print("请输入小数：")
        val in3 = StdIn.readDouble()

        println(s"控制台输入：${in}, ${in2}, ${in3}")


        //Scala过时Api
        val str = Console.readLine("请输入：")
        println(s"str = ${str}")


        //Java Api
        val sc = new Scanner(System.in).nextLine()
        println(s"Java Api = ${sc}")
    }
}
