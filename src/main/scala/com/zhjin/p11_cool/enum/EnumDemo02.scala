package com.zhjin.p11_cool.enum

object EnumDemo02 {

    def main(args: Array[String]): Unit = {
        println(Suits)
        println(Suits.isRed(Suits.diamond))
    }
}

object Suits extends Enumeration {
    type Suits = Value
    val spade = Value("黑桃")
    val club = Value("梅花")
    val heart = Value("红桃")
    val diamond = Value("方块")

    override def toString() = {
        Suits.values.mkString(",")
    }

    def isRed(suit: Suits): Boolean = suit == heart || suit == diamond
}
