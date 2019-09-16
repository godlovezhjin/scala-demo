package com.zhjin.p11_cool.reflex

import scala.reflect.runtime.universe._

//反射
object ReflexDemo01 {

    def main(args: Array[String]): Unit = {
        //得到了包装Type对象的TypeTag对象
        val typeTagList = typeTag[List[Int]]

        println(typeTagList)
        println(typeOf[List[Int]])
        println(typeTagList.tpe)
        println(typeTagList.tpe.decls.take(10))
    }
}
