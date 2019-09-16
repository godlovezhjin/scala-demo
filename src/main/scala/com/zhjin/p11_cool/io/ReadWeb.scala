package com.zhjin.p11_cool.io

import scala.io.Source

//读取网络资源
object ReadWeb {

    def main(args: Array[String]): Unit = {
        val webFile = Source.fromURL("http://www.baidu.com")
        webFile.foreach(print(_))
        webFile.close()
    }
}
