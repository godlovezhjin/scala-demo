package com.zhjin.p4_oop

//构造器
object ConstructorDemo {

    def main(args: Array[String]): Unit = {
        // val person = new Person("zhjin", 18)
        // println(person)

        // val p2 = new Person("tom")
        // println(p2)

        // val p3 = new Person(22)
        // println(p3)

        // val a = new AA("hadoop")
        // println(a)

        val c = new CC("python", 24)
        println(c)
    }
}

class Person(inName: String, inAge: Int) {
    var name: String = inName
    var age: Int = inAge
    println("~~~~这也是主构造器的内容~~~~")

    def this(name: String) {
        this("default", 18)
        this.name = name
    }

    def this(age: Int) {
        this("spark")
        this.age = age
    }

    //重写toString
    override def toString = s"Person($name, $age)"
}


class BB {
    println("~~~这是BB的主构造器~~~")
}

class AA extends BB {
    def this(name: String) {
        this
        println("~~~这是AA的辅助构造器~~~")
    }

    println("~~~这是AA的主构造器~~~")
}

//私有构造器
class CC private() {
    private var name: String = _
    private var age: Int = _

    private def this(name: String) {
        this
        this.name = name
        println("~~~CC的私有辅助构造器~~~")
    }

    def this(name: String, age: Int) {
        this
        this.name = name
        this.age = age
        println("~~~CC的公有辅助构造器~~~")
    }

    override def toString: String = s"(${name} ${age})"
}
