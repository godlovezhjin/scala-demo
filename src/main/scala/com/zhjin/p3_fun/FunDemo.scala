package com.zhjin.p3_fun

object FunDemo {

    def getRes(a: Int, b: Int, char: Char) = {
        if (char == '+') {
            a + b
        } else if (char == '-') {
            a - b
        } else {
            null
        }
    }

    def test = {
        "scala"
    } //等价于 def test = "scala"

    def test2() = 2

    def main(args: Array[String]): Unit = {
        println(getRes(1, 2, '+'))
        println(test)
        println(test2)
    }
}
