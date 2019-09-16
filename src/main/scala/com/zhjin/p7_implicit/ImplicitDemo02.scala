package com.zhjin.p7_implicit

//隐式转换丰富类型,也保留了原来的类型
object ImplicitDemo02 {
    implicit def addDelete(arg: MySQL): DB = {
        new DB
    }

    def main(args: Array[String]): Unit = {
        val mysql = new MySQL
        mysql.insert()
        mysql.delete()
    }
}


class MySQL {
    def insert(): Unit = {
        println("insert")
    }
}

class DB {
    def delete(): Unit = {
        println("delete...")
    }
}