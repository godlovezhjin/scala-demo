package com.zhjin.p9_match.caseclass

//捆绑销售案例
object SaleDemo {
    
    def main(args: Array[String]): Unit = {
        //sale是一捆书 [单本书, Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)]
        //手工计算：(40 – 10) + ((80 + 30) - 20) = 120
        val sale = Bundle("书籍", 10,
            Book("漫画", 40),
            Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)),
            Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))

        val res = price(sale)
        println(s"总价 = ${res}")
    }

    //设计函数递归统计捆商品的总价
    def price(item: Item): Double = {
        item match {
            case Book(_, p) => p
            case Bundle(_, discount, its@_*) => its.map(price).sum - discount
        }
    }
}


//设计样例类
abstract class Item //抽象类---于统一管理

//Book样例类：description--描述, price--价格
case class Book(description: String, price: Double) extends Item

//捆样例类：description--描述, discount--打折金额, item可以有其它的商品或Bundle
case class Bundle(description: String, discount: Double, item: Item*) extends Item