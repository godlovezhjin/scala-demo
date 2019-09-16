package com.zhjin.p1_base

object StringDemo02 {

    def main(args: Array[String]): Unit = {
        val str1 =
            """
              |abc
              |def
              |haha
            """.stripMargin
        println(s"str1 = ${str1}")


        val str2 =
            """
              abc
              def
              haha
            """
        println(s"str2 = ${str2}")
    }
}
