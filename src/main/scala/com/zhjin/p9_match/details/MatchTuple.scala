package com.zhjin.p9_match.details

//匹配元组
object MatchTuple {

    def main(args: Array[String]): Unit = {
        for (pair <- Array((0, 1), (2, 3, 0), (1, 1))) {
            val result: Any = pair match {
                case (0, _) => "0 ..."
                case (x, y, 0) => (x, y)
                case _ => "neither is 0"
            }
            println(result)
        }
    }
}
