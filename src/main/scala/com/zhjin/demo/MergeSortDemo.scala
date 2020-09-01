package com.zhjin.demo

/**
  * 归并排序
  * <p>
  * <p> 平均时间复杂度：O(n*log(n))
  * <p>
  */
object MergeSortDemo {

    def main(args: Array[String]): Unit = {
        val list = List(1, 3, 5, 7, 8, 4, 6, 2)

        println(s"排序前：${list.mkString(" ")}")

        val tuple: (List[Int], List[Int]) = list.partition(_ < 2)
        val sortdList: List[Int] = mergeSort(tuple._1, tuple._2)

        println(s"排序后：${sortdList.mkString(" ")}")
    }

    def mergeSort(left: List[Int], rigth: List[Int]): List[Int] = (left, rigth) match {
        case (Nil, _) => rigth
        case (_, Nil) => left
        case (x :: xTail, y :: yTail) =>
            if (x <= y) x :: mergeSort(xTail, rigth)
            else y :: mergeSort(left, yTail)
    }
}
