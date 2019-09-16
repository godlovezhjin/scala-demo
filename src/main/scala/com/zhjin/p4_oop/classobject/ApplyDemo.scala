package com.zhjin.p4_oop.classobject

object ApplyDemo {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4)
        println(list)

        val emp = Emp()
        println(emp)
        val emp2 = Emp("hive")
        println(emp2)
    }
}

class Emp(inName: String) {
    var name: String = inName

    def this() {
        this("")
    }

    override def toString = s"Emp($name)"
}

object Emp {
    def apply(): Emp = {
        println("~~~~11~~~~")
        new Emp("hbase")
    }

    def apply(name: String): Emp = {
        println("~~~~22~~~~")
        new Emp(name)
    }
}
