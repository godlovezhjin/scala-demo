package com.zhjin.p7_implicit

//隐式转化
object ImplicitDemo01 {
    def main(args: Array[String]): Unit = {
        implicit def double2int(d: Double): Int = {
            println("~~~隐式转化~~~")
            d.toInt
        }

        val a: Int = 3.5
    }
}
