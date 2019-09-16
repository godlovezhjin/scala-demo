package com.zhjin.p8_collection.extend

//视图---找出1-100中数字倒序排列和它本身相同的所有数(1, 2, 3 ... 11, 22, 33 ...)
object ViewDemo {
    
    def main(args: Array[String]): Unit = {
        val seq1 = (1 to 100).filter(n => n.toString.equals(n.toString.reverse))
        println("seq1=" + seq1) //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99)

        val seq2 = (1 to 100).view.filter(n => n.toString.equals(n.toString.reverse))
        println("seq2=" + seq2) //seq2=SeqViewF(...)
        println(s"${seq2(1)}  ${seq2.last}") //2  99
        for (elem <- seq2) print(elem + " ")
    }
}