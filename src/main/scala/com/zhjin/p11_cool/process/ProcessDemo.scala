package com.zhjin.p11_cool.process

import java.io.File

//进程控制
object ProcessDemo {

    def main(args: Array[String]): Unit = {
        //执行shell
        import sys.process._
        "ls -al /" !;
        "ls -al /" !!;


        //管道符
        import sys.process._
        "ls -al /" #| "grep etc" !;


        //将shell的执行结果重定向到文件
        import sys.process._
        "ls -al /" #| "grep etc" !;
        "ls -al /" #>> new File("e:/tmp/output.txt") !;
    }
}
