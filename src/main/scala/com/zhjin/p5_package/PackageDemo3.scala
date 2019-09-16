package com.zhjin {
    package testpackage {

        import com.zhjin.service.Employee

        object TestPackage {
            def main(args: Array[String]): Unit = {
                val emp = new Employee
                println(emp)

                val user = new User
                println(user)

                println("测试包3")
            }
        }

    }

    package service {

        class Employee() {}

    }

    class User {}

}
