package com.zhjin.p6_trait.mixin

object MixinDemo02 {
    def main(args: Array[String]): Unit = {
        println("XXX")
        val mysql5 = new MySQL5 with DB5 with File5
        mysql5.insert(666)

        // val mySQL = new MySQL5 with File5   ----报错
    }
}


trait Operate5 {
    def insert(id: Int)
}


trait File5 extends Operate5 {
    //表示为完全重写
    abstract override def insert(id: Int): Unit = {
        println("~~~File5~~~" + 10)
        super.insert(id)
    }
}

trait DB5 extends Operate5 {
    override def insert(id: Int): Unit = {
        println("~~~DB5~~~" + 10)
    }
}

class MySQL5 {}