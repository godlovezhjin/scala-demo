package com.zhjin.p8_collection.tuple

object TupleDemo01 {

    def main(args: Array[String]): Unit = {
        //创建
        val tuple = ("hello", 1, 3.0F, true)
        println(tuple)

        //取值
        println(tuple._1) //hello
        println(tuple.productElement(0)) //hello

        //遍历--方式1
        for (e <- tuple.productIterator) print(e + " ")
        println("\n---------------------")
        //遍历--方式2
        tuple.productIterator.foreach(println(_))
        tuple.productIterator.foreach(i => println("tuple的元素：" + i))
    }
}
