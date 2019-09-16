package com.zhjin.p4_oop.myextends

object FiledOverrideVar extends App {
    val obj: AAAA = new BBBB
    println(obj.name + "\t" + obj.age)
}

abstract class AAAA {
    var name: String
    var age: Int = 10
}

class BBBB extends AAAA {
    var name = "scala" //override可写可不写
    //override var age: Int = 20 //不能重写非抽象的
}
