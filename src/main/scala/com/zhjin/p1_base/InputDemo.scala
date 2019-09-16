package com.zhjin.p1_base

object InputDemo {

    def main(args: Array[String]): Unit = {
        val name = scala.io.StdIn.readLine("请输入姓名：");
        println("name = " + name)

        println("请输入年龄：")
        val age = scala.io.StdIn.readInt();
        println("age = " + age)

        println("请输入工资：")
        val salary = scala.io.StdIn.readDouble();
        println("salary = " + salary)
    }
}
