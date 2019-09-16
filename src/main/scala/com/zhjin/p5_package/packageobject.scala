
/**
  * 包：
  * 1)声明包的3众方式
  * 2)引入包
  * 3)包的权限
  * 4)包对象
  */
package com.zhjin {

    package object packageobject {
        val num = 10

        def test(): Unit = {
            println("~~~包对象~~~")
        }
    }

    package packageobject {

        object TestPackageObject {
            def main(args: Array[String]): Unit = {
                println(num)

                test()
            }
        }

        package object test1 {}
        package test1 {}

    }

}


