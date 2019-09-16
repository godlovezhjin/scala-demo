package com.zhjin.p11_cool.exception

//异常
object ExceptionDemo {

    //抛异常
    def test(): Nothing = {
        throw new RuntimeException("-------异常了--------")
    }

    def main(args: Array[String]): Unit = {
        try {
            println("~~~开始~~~")
            // println(10 / 0)
            test()
        } catch {
            case e: Exception => {
                println("捕获了异常1：" + e)
            }
            case e: ArithmeticException => println("捕获了异常2：" + e)
            case e: RuntimeException => println("捕获了异常3：" + e)
        } finally {
            println("scala finally")
        }
    }
}
