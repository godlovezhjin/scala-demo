package com.zhjin.p10_functional

//闭包
object ClosureDemo {

    def main(args: Array[String]): Unit = {
        val f = makeSuf(".jpg")
        println("f = " + f)
        println(f("dog.jpg"))
        println(f("cat"))
    }

    //闭包函数
    def makeSuf(suffix: String) = {
        (filename: String) => {
            if (filename.endsWith(suffix)) filename
            else filename + suffix
        }
    }
}
