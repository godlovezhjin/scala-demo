package com.zhjin.p11_cool.exception

//声明异常
object ThrowsDemo {

    @throws(classOf[NumberFormatException])
    def fun(): Unit = {
        println("111111111")
        "abc".toInt
    }

    @throws(classOf[MyException])
    def fun2(n: Int, m: Int): Int = {
        if (m == 0) {
            throw new MyException();
        }
        return n / m
    }


    def main(args: Array[String]): Unit = {
        // fun()

        try {
            println(fun2(10, 0))
        } catch {
            case e: MyException => {
                println("~~~eeeee~~~")
            }
        }
    }
}


class MyException extends RuntimeException {
    println("~~~自定义异常~~~")
    printStackTrace()
}
