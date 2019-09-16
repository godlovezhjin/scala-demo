package com.zhjin.p10_functional

//控制抽象---实现while循环
object ControlAbstractDemo02 {

    def main(args: Array[String]): Unit = {
        //while循环
        var i = 10
        while (i >= 1) {
            println("while i = " + i)
            i -= 1
        }


        //控制抽象模拟while
        def myWhile(condition: => Boolean)(block: => Unit): Unit = {
            if (condition) {
                block
                myWhile(condition)(block)
            }
        }

        var j = 10
        myWhile(j >= 1) {
            println("myWhile j = " + j)
            j -= 1
        }
    }
}
