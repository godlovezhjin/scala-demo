package com.zhjin.p9_match.caseclass

//匹配嵌套结构
object CaseClassDemo03 {

    def main(args: Array[String]): Unit = {
        val sale = Bundle("书籍", 10,
            Book("漫画", 40),
            Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))


        //取出"漫画", _表示忽略, _*表示忽略后面所有的
        val res1 = sale match {
            case Bundle(_, _, Book(desc, _), _*) => desc
        }
        println(s"res1 = ${res1}")


        //@表示法将嵌套的值绑定到变量, _*绑定剩余Item到rest
        val res2 = sale match {
            case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
        }
        println(s"art1 = ${res2._1}  \nrest1 = ${res2._2}")


        //因为没有使用_*即明确说明没有多个Bundle,所以返回的rest就不是WrappedArray了
        val res3 = sale match {
            case Bundle(_, _, art@Book(_, _), rest) => (art, rest)
        }
        println(s"art2 = ${res3._1}  \nrest2 = ${res3._2}")
    }
}


//测试密封类
class Test extends Amount