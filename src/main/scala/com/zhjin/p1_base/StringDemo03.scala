package com.zhjin.p1_base

//字符串拼接
object StringDemo03 {

    def main(args: Array[String]): Unit = {
        val name: String = "tom"
        val age: Int = 100
        val sal: Double = 7890.14455

        //方式一
        println("name=" + name + ", age=" + age + ", sal=" + sal.formatted("%.2f"))

        //方式二
        printf("name=%s, age=%d, sal=%.2f\n", name, age, sal)

        //方式三
        println(s"name=$name, age=${age + 1}, sal=${mul(25, 15)}")
    }

    /**
      * @param n1
      * @param n2
      * @return
      */
    def mul(n1: Int, n2: Int): Int = {
        return n1 * n2
    }
}
