package com.zhjin.p8_collection.par

//并行集合
object ParDemo01 {

    def main(args: Array[String]): Unit = {
        //串行化执行
        (1 to 10).foreach(println(_))
        println("\n-------------------")

        //并行执行
        (1 to 10).par.foreach(println)
        println()
    }
}
