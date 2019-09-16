package com.zhjin.p3_fun

//可变参数
object VarParam {

    def sum(nums: Int*): Int = {
        var sum = 0
        for (e <- nums) {
            sum += e
        }
        sum
    }

    def main(args: Array[String]): Unit = {
        println(sum(1, 2, 3, 4, 5, 6))
    }
}
