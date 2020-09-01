package com.zhjin.demo

/**
  * 快速排序
  * <p>
  * <p> 平均时间复杂度：O(n*log(n))
  * <p>
  */
object QuickSortDemo {

    def main(args: Array[String]): Unit = {
        val list = List(1, 3, 5, 7, 8, 4, 6, 2)

        println(s"排序前：${list.mkString(" ")}")

        val sortdList: List[Int] = quickSort(list)

        println(s"排序后：${sortdList.mkString(" ")}")
    }

    def quickSort(list: List[Int]): List[Int] = list match {
        case Nil => Nil
        case List() => List()
        case head :: tail =>
            val (left, right) = tail.partition(_ < head)
            quickSort(left) ::: head :: quickSort(right)
    }
}
