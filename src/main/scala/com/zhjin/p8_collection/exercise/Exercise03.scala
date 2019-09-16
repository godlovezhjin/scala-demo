package com.zhjin.p8_collection.exercise

object Exercise03 {

    def main(args: Array[String]): Unit = {
        val list = List(Some(1), None, Some(3), Some(5), None)
        println(my_sum(list))
    }

    //计算List[Option]集合所以非None的值
    def my_sum(lst: List[Option[Int]]) = {
        lst.map(_.getOrElse(0)).sum
    }
}
