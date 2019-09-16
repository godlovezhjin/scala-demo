package com.zhjin.p8_collection.extend

//流
object StreamDemo {

    def main(args: Array[String]): Unit = {
        //定义stream流函数---生成规则
        def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

        //创建集合
        val stream1 = numsForm(1)
        //Api
        println(stream1) //Stream(1, ?)
        println(stream1.head) //1
        println(numsForm(4).tail) //Stream(5, ?)
        println(numsForm(5).map(n => n * n)) //Stream(25, ?)
    }
}
