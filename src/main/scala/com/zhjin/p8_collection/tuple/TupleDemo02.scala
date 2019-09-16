package com.zhjin.p8_collection.tuple

object TupleDemo02 {

    def main(args: Array[String]): Unit = {
        var (a, b) = (1, 2)
        println("a = " + a + "\tb = " + b)

        val (c, d) = (a, b)
        println("c = " + c + "\td = " + d)
    }
}
