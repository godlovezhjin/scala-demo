package com.zhjin.p6_trait

object SelfTypeDemo {
    def main(args: Array[String]): Unit = {

    }
}


//Logger就是自身类型特质
//相当于 trait Logger extends Exception, 要求混去该特质的类是Exception的子类
trait Logger {
    //明确告诉编译器,我就是Exception,如果没有这句话,下面的getMessage不能调用
    this: Exception =>
    def log(): Unit = {
        //既然我就是 Exception,那么就可以调用其中的方法
        println(getMessage)
    }
}

//因为Logger使用自身类型,要求继承(混入)Logger必须是Exception子类
//class AAA extends Logger {}    错误
class BBB extends Exception with Logger {} //ok