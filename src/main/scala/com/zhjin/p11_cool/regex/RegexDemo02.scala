package com.zhjin.p11_cool.regex

object RegexDemo02 {

    def main(args: Array[String]): Unit = {

        val email_regex = "^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$"
        val tel_regex = "^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$"

        println("zhjin@163.com".matches(email_regex))
        println("13823083205".matches(tel_regex))
    }
}
