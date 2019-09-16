package com.zhjin.p8_collection.array

//多维数组
object MultiplyArray {

    def main(args: Array[String]): Unit = {
        //创建
        val arr = Array.ofDim[Int](2, 3) //2行3列

        //赋值
        arr(0)(1) = 1
        arr(1)(1) = 2

        //取值
        println("1行1列值 = " + arr(1)(1))
        println("行数 = " + arr.length)
        println("列数 = " + arr(0).length)

        //遍历
        for (elems <- arr) {
            for (elem <- elems) print(elem + " ")
            println()
        }
        println("-----------")
        for (i <- 0 until arr.length) {
            for (j <- 0 until arr(i).length) print(arr(i)(j) + " ")
            println()
        }
    }
}
