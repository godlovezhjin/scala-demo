package com.zhjin.p7_implicit

//隐式类
object ImplicitClassDemo {

    //DB2是一个隐式类,在这个能访问到这个类的作用域中创建MySQL实例时,该隐式类就会生效
    implicit class DB2(val m: MySQL2) {
        def addSuffix(): String = { //方法
            m + " scala"
        }
    }

    def main(args: Array[String]): Unit = {
        val mysql = new MySQL2
        mysql.sayOk()
        println(mysql.addSuffix()) //将MySQL2类型转成DB2类型
    }
}

//普通类
class MySQL2 {
    def sayOk(): Unit = {
        println("sayOk")
    }

    override def toString = s"MySQL2()"
}

object Test {
    def main(args: Array[String]): Unit = {
        val mysql = new MySQL2
        mysql.sayOk()
        //println(mysql.addSuffix()) //将MySQL2类型转成DB2类型
    }
}
