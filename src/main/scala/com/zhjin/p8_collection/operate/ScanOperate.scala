package com.zhjin.p8_collection.operate

//扫描
object ScanOperate {

    def main(args: Array[String]): Unit = {
        //4, 4-1, 4-1-2, 4-1-2-3
        val list = List(1, 2, 3).scan(4)((a, b) => a - b)
        println("list = " + list)

        println("向左扫描：" + (1 to 5).scanLeft(1)((a, b) => a + b))
        println("向右扫描：" + (1 to 3).scanRight(1)((a, b) => a + b))

        println("斐波那契额数列：" + (0 to 5).scan(1)((a, b) => a + b))
    }
}
