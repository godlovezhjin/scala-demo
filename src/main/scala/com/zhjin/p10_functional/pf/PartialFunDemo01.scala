package com.zhjin.p10_functional.pf

//偏函数----过滤掉非数字,对数字加一
object PartialFunDemo01 {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, "abc")

        //filter + map方式
        val res1 = list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int]).map(_ + 1)
        println(s"res1 = ${res1}")

        //模式匹配方式
        val res2 = list.map(addOne)
        println(s"res2 = ${res2}")

        //偏函数方式---见PartialFunDemo02
    }

    def addOne(n: Any): Any = {
        val res = n match {
            case m: Int => m + 1
            case _ =>
        }
        return res
    }
}
