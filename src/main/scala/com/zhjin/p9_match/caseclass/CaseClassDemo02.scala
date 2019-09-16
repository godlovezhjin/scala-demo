package com.zhjin.p9_match.caseclass

object CaseClassDemo02 {

    def main(args: Array[String]): Unit = {
        val array = Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)
        for (amt <- array) {
            val result = amt match {
                //说明
                case Dollar(v) => "$" + v //对象匹配 1000.0
                //说明
                case Currency(v, u) => v + " " + u // 1000.0 RMB
                case NoAmount => ""
            }
            println(amt + ": " + result)
        }
    }
}
