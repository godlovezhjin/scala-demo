package com.zhjin.p9_match

object MatchDemo {

    def main(args: Array[String]): Unit = {
        val oper = '/'
        val n1 = 20
        val n2 = 0
        var res: Any = 0

        oper match {
            case '+' => res = n1 + n2
            case '-' => res = n1 - n2
            case '*' => res = n1 * n2
            case '/' =>
                if (n2 == 0) res = null else res = n1 / n2
            case _ => println("oper error")
        }
        println(s"res = ${res}")
    }
}
