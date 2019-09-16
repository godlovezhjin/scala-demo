package com.zhjin.p8_collection.operate

import scala.collection.immutable.Queue

//映射操作
object MapOperate {

    def mut(n: Int): Int = {
        println("mut调用了~~~")
        n * 2
    }

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3)

        //对所有元素都乘以2
        val list1 = list.map(mut) //遍历list,对每个元素执行mul(共执行3次)
        println("list1 = " + list1)

        val list2 = list.map(e => e * 2)
        println("list2 = " + list2)


        //测试自己的map
        val myList = MyList()
        val myList2 = myList.myMap(e => e * 2)
        println("myList2 = " + myList2)


        //练习---将集合中的元素都转成小写
        val queue = Queue("Java", "Scala", "MapReduce")
        println("都转小写：" + queue.map(s => s.toLowerCase))
    }
}


//map函数手动底层实现
class MyList {
    val list = List(11, 22, 23)

    def myMap(f: Int => Int): List[Int] = {
        var newList = List[Int]()
        //遍历
        for (elem <- list) {
            newList = newList :+ f(elem)
        }
        newList
    }
}

//伴生对象
object MyList {
    def apply(): MyList = new MyList()
}
