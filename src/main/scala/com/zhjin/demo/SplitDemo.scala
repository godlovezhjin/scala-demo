package com.zhjin.demo

/**
  * 实现一个拆分函数,如下所示:
  * <p> split(input, listOfTokens) ==> listOfTokens
  * <p>
  * <p> e.g. split("abc,def.ghi", {"ef", "c"} )  ==>  {"ab", ",d", ".ghi"}
  * <p>
  */
object SplitDemo {

    def main(args: Array[String]): Unit = {
        val input = "abc,def.ghi"
        val listOfTokens: List[String] = List("ef", "c")

        var result: Array[String] = Array(input)
        for (s <- listOfTokens) {
            result = result.flatMap(_.split(s))
        }

        println(result.mkString(" "))
    }
}