package com.zhjin.p10_functional.pf

//偏函数的常见写法
object PartialFunDemo03 {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, "abc")


        //传统写法
        val res1 = list.collect(new PartialFunction[Any, Int] {
            override def isDefinedAt(x: Any) = x.isInstanceOf[Int]

            override def apply(v1: Any) = v1.asInstanceOf[Int] + 1
        })


        //简化写法1
        def pf2: PartialFunction[Any, Int] = {
            case i: Int => i + 1
        }

        val res2 = list.collect(pf2)


        //简化写法2----推荐写法
        val res3 = list.collect { case i: Int => i + 1 }

        println(s"res1 = ${res1}  \nres2 = ${res2}  \nres3 = ${res3}")
    }
}
