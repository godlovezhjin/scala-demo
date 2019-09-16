package com.zhjin.p10_functional.recursion

//递归---反转
object Reversal {

    def main(args: Array[String]): Unit = {
        println(reversal("HelloScala"))
    }

    def reversal(str: String): String = {
        if (str.length == 1) str
        else reversal(str.tail) + str.head
    }
}
