package com.zhjin.p10_functional.pf

//偏函数----过滤掉非数字,对数字加一
object PartialFunDemo02 {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, "abc")

        //定义偏函数
        val pf = new PartialFunction[Any, Int] {
            override def isDefinedAt(x: Any) = x.isInstanceOf[Int]

            override def apply(v1: Any) = v1.asInstanceOf[Int] + 1
        }

        //调用偏函数
        val res = list.collect(pf)
        println(s"res = ${res}")
    }
}
