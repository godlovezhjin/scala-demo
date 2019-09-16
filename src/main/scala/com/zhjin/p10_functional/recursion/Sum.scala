package com.zhjin.p10_functional.recursion

//递归---求1——9999999的和
object Sum {

    def main(args: Array[String]): Unit = {
        println(Long.MaxValue)

        val start = System.currentTimeMillis()
        val res1 = while_mode()
        println(s"while_mode = $res1 \twhile_mode time = ${(System.currentTimeMillis() - start)}")

        val start2 = System.currentTimeMillis()
        val res2 = for_mode()
        println(s"for_mode = $res2 \tfor_mode time = ${(System.currentTimeMillis() - start2)}")

        val start3 = System.currentTimeMillis()
        val res3 = recursion_mode(1, 0)
        println(s"recursion_mode = $res3 \trecursion_mode time = ${(System.currentTimeMillis() - start3)}")
    }


    //递归方式
    def recursion_mode(max: Long, sum: Long): Long = {
        if (max <= 310000000) recursion_mode(max + 1, sum + max)
        else sum
    }

    //while方式
    def while_mode(): Long = {
        var res = 0L
        var n = 1
        while (n <= 310000000) {
            res += n
            n += 1
        }
        res
    }

    //for方式
    def for_mode(): Long = {
        val start = System.currentTimeMillis()
        var res = 0L
        for (n <- 1 to 310000000) {
            res += n
        }
        res
    }
}
