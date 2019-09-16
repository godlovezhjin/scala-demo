package com.zhjin.p8_collection.exercise

import scala.collection.mutable.ArrayBuffer

//练习1---将"AAABBBCCCDDD"中各个字符,通过foldLeft存放到一个 ArrayBuffer中
object Exercise01 {

    def main(args: Array[String]): Unit = {
        val sentence = "AAABBBCCCDDD"
        val buffer = ArrayBuffer[Char]()
        sentence.foldLeft(buffer)(putChar)
        println("buffer = " + buffer) //ArrayBuffer(A, A, A, B, B, B, C, C, C, D, D, D)
    }

    //向ArrayBuffer中追加元素的普通方法
    def putChar(ab: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
        ab.append(c)
        return ab
    }
}
