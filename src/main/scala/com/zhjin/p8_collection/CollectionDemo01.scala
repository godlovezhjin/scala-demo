package com.zhjin.p8_collection

object CollectionDemo01 {

    def main(args: Array[String]): Unit = {
        val coll = 1 to 3
        println(coll.getClass)

        //字符串是一个字符序列
        val name = "godlovezhjin"
        println(name(7))
    }
}
