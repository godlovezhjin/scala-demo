package com.zhjin.p9_match.caseclass

//样例类
object CaseClassDemo01 {

    def main(args: Array[String]): Unit = {
        val dollar = new Dollar(1.1)
        println(dollar.value)

        val currency = new Currency(3000, "RMB")
        val currency1 = currency.copy() //复制新对象
        println(currency1.value)

        val currency2 = currency.copy(1200)
        println(currency2.toString)
    }
}


abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount

case class Dog(name: String) {
    var age = 10

    def cry(): Unit = {
        println("小狗汪汪叫~~")
    }
}