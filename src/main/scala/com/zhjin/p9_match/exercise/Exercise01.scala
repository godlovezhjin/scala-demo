package com.zhjin.p9_match.exercise

object Exercise01 {

    def main(args: Array[String]): Unit = {
        println(swap_tuple((1, 3)))

        val array = swap_arr12(Array(1, 3, 5, 7, 9))
        array.foreach(print(_))
    }

    //元组交换两个元素
    def swap_tuple[T, S](tuple: (T, S)) = {
        tuple match {
            case (a, b) => (b, a)
            case _ => println("匹配不成功...")
        }
    }


    //当元素个数大于等于2时,交换数组的前两个元素
    def swap_arr12(arr: Array[Any]) = {
        arr match {
            case Array(a, b, other@_*) => Array(b, a) ++ other
            case _ => arr
        }
    }
}
