package com.zhjin.p1_base

//数据类型
object DataTypeDemo {

    def main(args: Array[String]): Unit = {
        val num: Int = 10
        //类型转换 toXXX方法
        println(num.toDouble + "\t" + num.toFloat + "\t" + 100.toString)

        //保留小数---返回的是一个字符串
        val str: String = 3.333333.formatted("%.2f")
        println(str + "\t" + str.getClass)

        //引用数据类型转换
        val n = "1";
        println(n.isInstanceOf[String])
        println(n.isInstanceOf[Int])
        println(classOf[String])
        val obj = new Object
        val s = obj.asInstanceOf[String]
        println(s)
    }
}
