package com.zhjin.p10_functional

//控制抽象
object ControlAbstractDemo01 {

    def main(args: Array[String]): Unit = {
        //传统写法---声明
        def myRunInThread1(f1: () => Unit) = {
            new Thread {
                override def run(): Unit = {
                    f1()
                }
            }.start()
        }

        //传统写法---调用
        myRunInThread1(() => {
            println("干活咯, 3秒完成...")
            Thread.sleep(3000)
            println("干完咯！")
        })


        //控制抽象---声明
        def myRunInThread2(f1: => Unit) = {
            new Thread {
                override def run(): Unit = {
                    f1
                }
            }.start()
        }

        //控制抽象---调用
        myRunInThread2 {
            println("干活咯, 3秒完成...")
            Thread.sleep(3000)
            println("干完咯！")
        }
    }
}
