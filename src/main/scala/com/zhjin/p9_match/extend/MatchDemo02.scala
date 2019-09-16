package com.zhjin.p9_match.extend

//变量声明中的模式匹配----相当于Python的元组解包
object MatchDemo02 {

    def main(args: Array[String]): Unit = {
        val (x, y) = (1, 2)
        println(s"x=${x}  y=${y}")

        val (q, r) = BigInt(10) /% 3 //q = BigInt(10) / 3;     r = BigInt(10) % 3
        println(s"q=${q}  r=${r}")

        val Array(first, second, _*) = Array(1, 7, 2, 9)
        println(first, second) // 1, 7
    }
}
