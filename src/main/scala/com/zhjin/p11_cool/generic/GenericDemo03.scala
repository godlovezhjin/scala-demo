package com.zhjin.p11_cool.generic

/**
  * 范型---案例3：
  * 定义一个函数,可以获取各种类型的 List 的中间 index 的值
  */
object GenericDemo03 {

    def main(args: Array[String]): Unit = {
        println(getMidElem(List(1, 2, 3, 4, 5)))
        println(getMidElem(List("Java", "Scalc", "Python", "Shell")))
    }

    //获取List的中间index的值
    def getMidElem[E](lst: List[E]): E = {
        lst(lst.length / 2)
    }
}
