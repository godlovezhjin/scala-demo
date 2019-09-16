package com.zhjin.p8_collection.par

object ParDemo02 {

    def main(args: Array[String]): Unit = {
        val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }.distinct
        println("result1：" + result1)

        val result2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }.distinct
        println("size：" + result2.size + "\tresult2：" + result2)
    }
}
