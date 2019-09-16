package com.zhjin.p1_base

//操作符重载
object OperatorOverload {

    def main(args: Array[String]): Unit = {
        val cat = new Cat(18)

        //测试中置操作操作符
        println(s"${cat + 10}  ${cat.+(2)}")

        //测试后置操作符
        println(s"${cat ++}  ${cat.++}")

        //测试前置操作符
        println(s"${!cat}  ${cat.unary_!}")
    }
}

class Cat(inAge: Int) {
    var age: Int = inAge

    def +(n: Int): Int = {
        age + n
    }

    def ++(): Int = {
        age + 1
    }

    def unary_!(): Int = {
        -age
    }
}
