package com.zhjin.p7_implicit

//隐式变量
object ImplicitVarDemo {

    def main(args: Array[String]): Unit = {
        implicit var str: String = "scala" //隐式值

        def hello(implicit name: String): Unit = { //隐式参数
            println("name=" + name)
        }

        hello //使用隐式值不要带()
        hello("hadoop")


        def hello2(implicit name: String = "zhjin"): Unit = { //隐式参数
            println("name=" + name)
        }

        hello2
        hello2("hive")
    }
}

