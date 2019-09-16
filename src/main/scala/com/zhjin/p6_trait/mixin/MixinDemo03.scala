package com.zhjin.p6_trait.mixin

object MixinDemo03 {
    def main(args: Array[String]): Unit = {
        val mysql6 = new MySQL6 with Operate6 {
            override var sar = 100
        }

        println(mysql6.name)
        println(mysql6.sar)
    }
}

trait Operate6 {
    var sar: Int
    var name: String = "zhjin"
}

class MySQL6 {}