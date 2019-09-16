package com.zhjin.p11_cool.generic

//视图界定
object ViewBoundsDemo {

    //隐式函数
    implicit def person2OrderedPerson(person: Person) = new Ordered[Person] {
        override def compare(that: Person) = {
            println("hello compare 被调用~~")
            person.age - that.age
        }
    }

    def main(args: Array[String]): Unit = {
        //对两个 Person 对象进行比较
        val zhang3 = new Person("zhang3", 120)
        val li4 = new Person("li4", 123)
        val compareComm3 = new CompareComm3(zhang3, li4)
        println(compareComm3.greater2)
    }
}

//就是一个普通的 Person
class Person(val name: String, val age: Int) {
    //重写了 toString 方法
    override def toString: String = this.name + "\t" + this.age
}


/**
  * 1. T <% Ordered[T] : T 是 Ordered[T]子类型
  * 2. T <% Ordered[T] 支持隐式转换 <% <:
  */
class CompareComm3[T <% Ordered[T]](obj1: T, obj2: T) {
    def greater = if (obj1 > obj2) obj1 else obj2

    //使用到 compareTo
    def greater2 = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}