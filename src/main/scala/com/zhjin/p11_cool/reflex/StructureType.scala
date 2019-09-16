package com.zhjin.p11_cool.reflex

/**
  * 结构类型：是指一组关于抽象方法、字段和类型的规格说明,你可以对任何具备play方法的类的实例调用play方法,
  * 这种方式比定义特质更加灵活,是通过反射进行调用的：
  */
object StructureType {

    def main(args: Array[String]): Unit = {
        type X = {def play(): Unit} //type关键字是把 = 后面的内容命名为别名。

        def init(res: X) = res.play //本地方法

        init(new {
            def play() = println("Played")
        })

        init(new {
            def play() = println("Play再一次")
        })

        object A {
            def play() {
                println("A object play")
            }
        }

        init(A)
        val structure = new Structure
        init(structure)
    }

}

class Structure {
    def play() = println("play方法调用了")
}

