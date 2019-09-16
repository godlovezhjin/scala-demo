package com.zhjin.p8_collection.array

object ArrayDemo {

    def main(args: Array[String]): Unit = {
        val arr = new Array[String](4)
        arr(0) = "Java"
        arr(1) = "Scala"
        arr(2) = "Python"
        //取值
        println("取值：" + arr(2) + "  " + arr.apply(2))
        //修改
        arr.update(1, "haha")
        println("修改后：" + arr.mkString(" "))
        //追加--不可变数组不可在原有对象上追加元素, :+ 和+:返回新的数组,不影响元有数组,
        //冒号对着谁就在谁的基础上追加,可以追加别的类型
        println((arr :+ 99).mkString(" ")) //Java haha Python null 99
        println((88 +: arr).mkString(" ")) //88 Java haha Python null
        println(("str" +: arr).mkString(" ")) //str Java haha Python null
        println(arr.mkString(" ")) //Java haha Python null

        //遍历
        val arr2 = Array(1, 2, 3, "zhjin")
        for (elem <- arr2) print(elem + " ")
        println("\n---------------")
        for (index <- 0 until arr2.length) print(arr2(index) + " ")
        println("\n---------------")
        for (index <- 0 to arr2.length - 1) print(arr2(index) + " ")
        println("\n---------------")
        println(arr2.mkString(" "))
    }
}
