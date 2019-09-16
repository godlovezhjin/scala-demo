package com.zhjin.p9_match.details

import scala.collection.mutable.ArrayBuffer

//匹配数组
object MatchArray {

    def main(args: Array[String]): Unit = {
        val arrs = Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))
        for (arr <- arrs) {
            val result = arr match {
                case Array(0) => "0" //匹配只有0的数组
                case Array(x, y) => ArrayBuffer(y, x) //匹配有两个元素的数组, 交换元素
                case Array(0, _*) => "以0开头和数组"
                case _ => "匹配不成功..."
            }
            println("result = " + result)
        }
    }
}
