package com.zhjin.p4_oop

import scala.beans.BeanProperty

object BeanPropertyDemo {
    def main(args: Array[String]): Unit = {
        val stu = new Student
        stu.setName("data")
        stu.age = 3
        stu.gender_$eq(1)

        println(stu.getName)
        println(stu.getAge)
        println(stu.gender)
    }
}


//加@BeanProperty注解自动生成getXXX  setXXX方法
class Student {
    @BeanProperty var id: Long = _
    @BeanProperty var name: String = _
    @BeanProperty var age: Int = _
    @BeanProperty var gender: Int = _
}
