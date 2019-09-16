package com.zhjin.p11_cool.io

import java.io.{File, PrintWriter}

//写文件
object WriterFile {

    def main(args: Array[String]): Unit = {
        val writer = new PrintWriter(new File("E:/tmp/test.txt"))
        for (n <- 100 to 110) {
            writer.println(n)
        }
        writer.close()
    }
}
