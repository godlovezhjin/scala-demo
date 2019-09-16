package com.zhjin.p4_oop

//构造参数
object ConstructorParamDemo {

    def main(args: Array[String]): Unit = {
        val a = new A("sqoop")
        a.name
        // a.inName -----报错

        val b = new B("hive")
        // b.inName = "mysql"-----报错
        println(b.inName)

        val c = new C("oozie")
        c.inName = "redis"
        println(c.inName)
    }
}

//inName是局部变量
class A(inName: String) {
    val name = inName
}

//inName是B的只读私有属性
class B(val inName: String) {
    val name = inName
}

//inName是C的可读可写私有成员变量,有对应的getset方法
class C(var inName: String) {
    val name = inName
}
