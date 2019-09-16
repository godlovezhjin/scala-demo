package com.zhjin.p10_functional.exercise

object Exercise01 {

    def main(args: Array[String]): Unit = {
        val list = values(1, 5, x => x * x)
        println(s"list = ${list}")
    }
    
    def values(min: Int, max: Int, f: (Int) => Int) = {
        var newList = List[(Int, Int)]()
        (min to max).foreach {
            elem =>
                // newList = (elem, f(elem)) :: newList
                newList = newList :+ (elem, f(elem))
        }
        newList
    }
}
