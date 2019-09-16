package com.zhjin.p9_match

//守卫
object MatchIfDemo {

    def main(args: Array[String]): Unit = {
        for (ch <- "+-3!") {
            var sign, digit = 0
            ch match {
                case '+' => sign = 1
                case '-' => sign = -1
                case _ if ch.toString.equals("3") => digit = 3
                case _ => sign = 2
            }
            println(ch + " " + sign + " " + digit)
        }
    }
}
