package com.zhjin.p11_cool.generic

object CovariantDemo {

    def main(args: Array[String]): Unit = {
        //不可变
        val v11: Temp[Super] = new Temp[Super] //ok
        val v12: Temp[Sub] = new Temp[Sub] //ok
        // val v13: Temp[Super] = new Temp[Sub] //error
        // val v14: Temp[Sub] = new Temp[Super] //error


        //协变
        val v21: Temp2[Super] = new Temp2[Super] //ok
        val v22: Temp2[Sub] = new Temp2[Sub] //ok
        val v23: Temp2[Super] = new Temp2[Sub] //ok
        // val v24: Temp2[Sub] = new Temp2[Super] //error

        //逆变
        val v31: Temp3[Super] = new Temp3[Super] //ok
        val v32: Temp3[Sub] = new Temp3[Sub] //ok
        // val v33: Temp3[Super] = new Temp3[Sub] //error
        val v34: Temp3[Sub] = new Temp3[Super] //ok
    }
}

//不变
class Temp[T] {}

//协变
class Temp2[+T] {}

//协变
class Temp3[-T] {}


//父类
class Super {}

//子类
class Sub extends Super {}