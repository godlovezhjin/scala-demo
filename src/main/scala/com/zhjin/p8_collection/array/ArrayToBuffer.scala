package com.zhjin.p8_collection.array

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayToBuffer {

    def main(args: Array[String]): Unit = {
        val arr11 = Array(1, 2, 3)
        val buf11: mutable.Buffer[Int] = arr11.toBuffer

        val buf22 = new ArrayBuffer[Int]()
        val arr22: Array[Int] = buf22.toArray
    }
}
