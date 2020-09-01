package com.zhjin.demo

/**
  * 二分查找-----集合必须有序
  */
object BinarySearchDemo {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5, 6, 7, 8)
        println(binarySearch(list, 6))
    }

    //查到返回index,没查到返回-1
    def binarySearch(list: List[Int], num: Int): Int = {
        var min = 0
        var max = list.length - 1
        while (min <= max) {
            val middle = (min + max) / 2
            if (num == list(middle)) {
                return middle
            } else if (num <= list(middle)) {
                max = middle - 1
            } else {
                min = middle + 1
            }
        }

        return -1
    }
}
