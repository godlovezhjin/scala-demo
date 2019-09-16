package com.zhjin.p4_oop.innerclass

object InnerClasssDemo01 {

    def main(args: Array[String]): Unit = {
        //创建两个外部类对象
        val outer1: OuterClass = new OuterClass()
        val outer2: OuterClass = new OuterClass()

        //创建静态内部类对象
        val staticInner = new OuterClass.StaticInnerClass()
        println(staticInner)

        //创建成员内部类对象
        val inner1 = new outer1.InnerClass
        val inner2 = new outer2.InnerClass
        println(inner1)
        println(inner2)
        println(inner2.getClass)
        println(inner2.isInstanceOf[outer2.InnerClass]) //true
        inner1.info()

        val inner12 = new outer1.InnerClass2
        inner12.info()
    }
}


class OuterClass {
    myOuter =>

    class InnerClass2 {
        def info(): Unit = {
            println("name~~~~=" + myOuter.name) //myOuter是别名,相当于外部类的一个实例(此方式属性必须在内部类后面)
            println("age~~~~=" + myOuter.age)
        }
    }


    var name: String = "zhjin"
    private var age: Int = 18

    class InnerClass {
        def info(): Unit = {
            println("name=" + OuterClass.this.name) //OuterClass.this相当于外部类的一个实例
            println("age=" + OuterClass.this.age)
        }
    }

}

object OuterClass {

    class StaticInnerClass {
    }

}