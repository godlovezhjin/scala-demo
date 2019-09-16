package com.zhjin.p6_trait.mixin

//特质构造的顺序
object TraitCreateSeq {
    def main(args: Array[String]): Unit = {
        //方式1
        val ff = new FF //E A B C D F
        println("---------------------------------")

        //方式2
        val ff2 = new KK with CC with DD //E K A B C D
    }
}


trait AA {
    println("A...")
}

trait BB extends AA {
    println("B....")
}

trait CC extends BB {
    println("C....")
}

trait DD extends BB {
    println("D....")
}

class EE {
    println("E...")
}

class FF extends EE with CC with DD {
    println("F....")
}

class KK extends EE {
    println("K....")
}