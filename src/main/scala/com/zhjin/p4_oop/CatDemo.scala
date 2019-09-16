package com.zhjin.p4_oop

object CatDemo {

    def main(args: Array[String]): Unit = {
        val cat = new Cat()
        cat.name = "小花"
        cat.age_$eq(3)
        println(cat.name, cat.age, cat.color)
    }
}


//声明猫类
class Cat {
    var name = ""
    var age: Int = _ //默认值为0
    var color: String = _ //默认值为null
}