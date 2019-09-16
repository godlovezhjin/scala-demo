package com.zhjin.p4_oop.classobject

object ClassObjectDemo {

    def main(args: Array[String]): Unit = {
        val user = new User
        User.testObject()
    }
}

//伴生类
class User {
    val name: String = "zhjin"
    val age: Int = 18
}

object User {
    def testObject(): Unit = {
        println("~~伴生对象~~")
        new User().name
    }
}
