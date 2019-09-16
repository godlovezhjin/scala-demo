package com.zhjin.p4_oop.classobject

//单例模式
object SingleDemo {

    def main(args: Array[String]): Unit = {
        val dog1 = Dog
        val dog2 = Dog

        println(dog1 == dog2)
    }
}


class Dog private() {}

object Dog {
    var dog: Dog = null

    def apply(): Dog = {
        if (dog == null) {
            dog = new Dog()
        }
        return dog
    }
}