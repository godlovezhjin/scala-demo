package com.zhjin.p9_match.details

object MatchObject02 {

    def main(args: Array[String]): Unit = {
        val str = "tom,jack,smith"
        str match {
            case Names(a, b, c) => {
                println(s"a=$a b=$b c=$c")
            }
            case _ => println("匹配失败~~~")
        }
    }
}

object Names {
    //对象构建有多个参数时,进行对象匹配时会默认调用unapplySeq方法,匹配的规则和unapply一样, 只是Some(?, ?, ?)
    def unapplySeq(str: String): Option[Seq[String]] = {
        if (str.contains(",")) Some(str.split(",")) //Some("tom","jack","smith")
        else None
    }
}
