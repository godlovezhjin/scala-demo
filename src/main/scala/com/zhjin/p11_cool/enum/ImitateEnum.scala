package com.zhjin.p11_cool.enum

//模式匹配模拟枚举
object ImitateEnum {
    def main(args: Array[String]): Unit = {
        for (color <- Array(Red, Yellow, Green))
            println(
                color match {
                    case Red => "stop"
                    case Yellow => "slowly"
                    case Green => "go"
                })
    }
}


sealed abstract class TrafficLightColor

case object Red extends TrafficLightColor

case object Yellow extends TrafficLightColor

case object Green extends TrafficLightColor
