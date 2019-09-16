package com.zhjin.p11_cool.generic

/**
  * 范型---案例1：
  * 编写一个Message类,可以构建Int类型的 Message,String类型的Message.
  */
object GenericDemo01 {

    def main(args: Array[String]): Unit = {
        val intMsg = new IntMessage[Int](123)
        val strMsg = new StrMessage[String]("hello")

        println(intMsg.get)
        println(strMsg.get)
    }
}


abstract class Message[T](m: T) {
    def get: T = m
}

class IntMessage[Int](m: Int) extends Message(m)

class StrMessage[String](m: String) extends Message(m)