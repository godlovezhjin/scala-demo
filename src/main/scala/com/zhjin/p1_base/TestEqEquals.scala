package com.zhjin.p1_base

/**
  * 小节：
  * <p> eq：比较地址
  * <p> equals：比较值
  * <p> ==：当对象为null时等价eq,否则等价equals
  * <p>
  * <p>对于集合类型,sameElements比较的是值
  * <p>
  */
object TestEqEquals {

    case class Bread(brand: String, price: Int)

    def main(args: Array[String]) {
        //基本类型
        val j1 = "234"
        val j2 = 234.toString
        println(j1 eq j2) //false
        println(j1 equals j2) //true
        println(j1 == j2) //true
        println("============================================")

        //引用类型
        val b1 = Bread("BreadTalk", 50)
        val b2 = Bread("BreadTalk", 50)
        println(b1 eq b2) //false
        println(b1 equals b2) //true
        println(b1 == b2) //true
        println("============================================")

        //集合类型
        val a1 = Array("x", "y")
        val a2 = Array("x", "y")
        val a3 = Array("y", "x")
        println(a1 eq a2) //false
        println(a1 equals a2) //false
        println(a1 == a2) //false
        println(a1 sameElements a2) //true
        println(a1 sameElements a3) //false
        println("============================================")

        val m1 = Map(1 -> "x", 2 -> "y")
        val m2 = Map(1 -> "x", 2 -> "y")
        val m4 = Map(2 -> "y", 1 -> "x")
        val m3 = Map(1 -> "x", 2 -> "z")
        println(m1 sameElements m2) //true
        println(m1 sameElements m3) //false
        println(m1 sameElements m4) //false
        println("============================================")

        val s1 = Set("a", "b", "c")
        val s2 = Set("a", "b", "c")
        val s3 = Set("a", "c", "b")
        println(s1 equals s2) //true
        println(s1 equals s3) //true
        println(s1 sameElements s2) //true
        println(s1 sameElements s3) //false
    }
}
