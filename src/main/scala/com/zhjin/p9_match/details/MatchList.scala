package com.zhjin.p9_match.details

//匹配列表
object MatchList {

    def main(args: Array[String]): Unit = {
        val lists = Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))
        for (lst <- lists) {
            val result = lst match {
                case 0 :: Nil => "0"
                case x :: y :: Nil => x + "--" + y
                case 0 :: other => other
                case _ => "something else"
            }
            println(result)
        }
    }
}
