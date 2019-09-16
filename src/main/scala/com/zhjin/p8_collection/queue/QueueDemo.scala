package com.zhjin.p8_collection.queue

import scala.collection.mutable

object QueueDemo {

    def main(args: Array[String]): Unit = {
        val q1 = new mutable.Queue[Any]()
        q1 += 1
        q1 += List(2, 3, 4)
        q1 ++= Array(5, 6, 7)
        println(q1) //Queue(1, List(2, 3, 4), 5, 6, 7)

        //出队列---从队列头取出元素
        val e1 = q1.dequeue()
        println("e1=" + e1 + "\tq1=" + q1)

        //入队列---从队列尾加元素
        q1.enqueue(888, 999)
        println("q1=" + q1)

        //获取元素---不影响原队列
        println("对首：" + q1.head)
        println("对尾：" + q1.last)
        println("除第1个以外的所有元素：" + q1.tail)
        println("除第1/2个以外的所有元素：" + q1.tail.tail)
    }
}
