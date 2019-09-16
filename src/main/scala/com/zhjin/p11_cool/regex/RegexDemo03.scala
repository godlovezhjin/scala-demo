package com.zhjin.p11_cool.regex

import scala.util.matching.Regex

object RegexDemo03 {

    def isMatch(pattern: Regex, str: String) = {
        str match {
            case pattern(_*) => true
            case _ => false
        }
    }

    def main(args: Array[String]): Unit = {
        val email_regex = new Regex("^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$")
        val tel_regex = "^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$" r

        println(isMatch(email_regex, "zhjin@163.com"))
        println(isMatch(tel_regex, "13823083205"))
    }
}
