package com.zhjin.p5_package

//访问权限
object AccessAuthorityDemo {

    def main(args: Array[String]): Unit = {
        val car = new Car
        println(car.name)
        // println(car.age) ---不能访问
        // println(car.colour) ---不能访问
        car.test1
        // car.test2 ---不能访问
        // car.test3 ---不能访问

        car.name_$eq("")
        // car.age_$eq()---不能修改

        // 测试包访问权限
        car.price
    }
}


//伴生类
class Car {
    var name: String = "BMW"
    private var age: Int = 5
    protected var colour: String = "red"

    // 加包访问权限
    private[p5_package] var price: Double = 100


    def test1(): Unit = {
        println("~~~默认修饰方法~~~")
    }

    private def test2(): Unit = {
        println("~~~private 修饰方法~~~")
    }

    protected def test3(): Unit = {
        println("~~~protected 修饰方法~~~")
    }
}

//伴生对象
object Car {
    def test(c: Car): Unit = {
        println(c.name)
        println(c.age)
        println(c.colour)
        println(c.test1())
        println(c.test2())
        println(c.test3())
    }
}
