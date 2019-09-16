package com.zhjin.p10_functional

//函数柯里化----对两个字符串忽略大小写比较
object CurryDemo02 {

    def main(args: Array[String]): Unit = {
        //比较字符串
        def eq(s1: String, s2: String): Boolean = {
            s1.equals(s2)
        }

        //隐式类
        implicit class TestEq(str: String) {
            //将字符串转小写后调函数
            def checkEq(s: String)(f: (String, String) => Boolean): Boolean = {
                f(str.toLowerCase, s.toLowerCase)
            }
        }


        //测试
        val res1 = "hello".checkEq("Hello")(eq)
        println(s"res1 = ${res1}")

        //高级写法
        println(s"res2 = ${"hello".checkEq("Hello")(_.equals(_))}")
    }
}
