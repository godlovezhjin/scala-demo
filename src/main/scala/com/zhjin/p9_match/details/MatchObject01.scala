package com.zhjin.p9_match.details

//对象匹配
object MatchObject01 {

    def main(args: Array[String]): Unit = {
        val num: Double = 36.0
        //1.把num传递给Square unapply(z: Double),返回一个结果
        //2.如果返回的结果是Some集合,则表示匹配成功,如果返回的是None则表示匹配失败
        //3.如果匹配成功,就是将Some(XXX)的值,赋给case Square(n)的n
        num match {
            case Square(n) => println("n = " + n) // 6.0
            case _ => println("nothing matched")
        }
    }
}

//unapply---对象提取器,  apply---对象构建器
object Square {
    def unapply(z: Double): Option[Double] = {
        println("unapply 被调用 z = " + z)
        Some(math.sqrt(z))
    }

    def apply(z: Double): Double = z * z
}
