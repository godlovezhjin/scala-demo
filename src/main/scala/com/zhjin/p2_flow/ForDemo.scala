package com.zhjin.p2_flow

object ForDemo {

    //基本语法
    def for_demo(): Unit = {
        //循环输出5次 to--前闭后闭
        for (item <- 1 to 5) {
            println(s"sacla ---> $item")
        }

        //对集合遍历
        val list = List("Hadoop", "Scala", "Spark", "Python", "Java")
        for (item <- list) {
            printf("item = %s\n", item)
        }

        //until--前闭后开
        for (item <- 1 until 5) {
            println(s"Java ---> $item")
        }
    }

    //循环守卫
    def for_guard(): Unit = {
        //保护式
        for (i <- 1 to 10 if i % 2 == 0) {
            print(i + "\t")
        }

        //等价于
        for (i <- 1 to 10) {
            if (i % 2 == 0) {
                print(i + "\t")
            }
        }
    }

    //引入变量
    def for_var(): Unit = {
        for (i <- 1 to 5; j = math.pow(i, 2)) {
            print(j + "\t")
        }
    }

    //多层循环
    def for_for(): Unit = {
        for (i <- 1 to 3; j <- 1 until 3) {
            println(i, j)
        }
    }

    //循环返回值
    def for_yield(): Unit = {
        val res = for (i <- 1 to 10) yield {
            if (i % 2 == 0) {
                math.sqrt(i).formatted("%.2f")
            } else {
                math.pow(i, 2)
            }
        }
        println(res)
    }

    //小括号换花括号
    def for2: Unit = {
        //一般形式
        for (i <- 1 to 3; j = i * 2) {
            println(" i= " + i + " j= " + j)
        }

        println("-------------毫无意义的分割线--------------")
        //等价写法
        for {i <- 1 to 3
             j = i * 2} {
            println(" i= " + i + " j= " + j)
        }
    }

    //步长控制
    def for_spet(): Unit = {
        for (e <- Range(1, 10, 2)) {
            print(e + "\t")
        }
        println()
        for (e <- Range(10, 1, -2)) {
            print(e + "\t")
        }
    }

    def main(args: Array[String]): Unit = {
        // for_demo()
        // for_guard()
        // for_var
        // for_for
        // for_yield
        // for2
        // for_spet()

        val r1 = Range(1, 5) // Range(1, 2, 3, 4)
        val r2 = Range(1, 6, 2) // Range(1, 3, 5)
        val r3 = Range(5, 1, -1) // Range(5, 4, 3, 2)
        println(r3)
    }
}
