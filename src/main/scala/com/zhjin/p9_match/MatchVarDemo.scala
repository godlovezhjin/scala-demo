package com.zhjin.p9_match

//match中的变量
object MatchVarDemo {

    def main(args: Array[String]): Unit = {
        val ch = '+'
        val res = ch match {
            case '+' => println("ok~")
            //1.mychar = ch  2.然后再去匹配
            case mychar => println("ok~" + mychar)
            case _ => println("ok~~")
        }
    }
}
