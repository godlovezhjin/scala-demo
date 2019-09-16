package com.zhjin.p9_match.extend

//中置表达式
object MidCase {

    def main(args: Array[String]): Unit = {
        List(1, 3, 5, 7, 9) match {
            case a :: b :: other => println(s"$a $b $other")
            case _ => println("匹配不成功...")
        }
    }
}
