package com.zhjin.p1_base

object StringDemo01 {

    def main(args: Array[String]): Unit = {
        val str: String = "hello"

        println("取前2个：" + str.take(2)) //he
        println("取后2个：" + str.takeRight(2)) //lo
        println("除去前2个的子串：" + str.drop(2)) //llo
        println(s"首字符：${str.head}  ${str(0)}  ${str.charAt(0)}  ${str.take(1)}") //h
        println(s"尾字符：${str.last}  ${str(4)}  ${str.charAt(4)}  ${str.takeRight(1)}") //o

        println("拼接字符串：" + str.concat(" world")) //hello world
        println("compareToIgnoreCase：" + str.equalsIgnoreCase("Hello")) //true
        println("indexOf：" + str.indexOf("l")) //2
        println("lastIndexOf：" + str.lastIndexOf("l")) //3
        println("toList：" + str.toList) //List(h, e, l, l, o)
        println("contains：" + str.contains("e")) //true
        println("replace：" + str.replace("h", "H")) //Hello
    }
}
