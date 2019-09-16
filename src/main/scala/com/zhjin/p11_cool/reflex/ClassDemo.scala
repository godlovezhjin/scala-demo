package com.zhjin.p11_cool.reflex

import java.util.HashMap

object ClassDemo {

    def main(args: Array[String]): Unit = {
        val a = new HashMap[String, String]
        println(a.getClass)
        println(classOf[HashMap[String, String]])
        println(reflect.runtime.universe.typeOf[HashMap[String, String]])
    }
}