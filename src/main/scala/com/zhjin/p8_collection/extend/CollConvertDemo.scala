package com.zhjin.p8_collection.extend

import scala.collection.mutable.Buffer

//集合的相互转换
object CollConvertDemo {

    def main(args: Array[String]): Unit = {
        val list: List[(String, Int)] = Map("Java" -> 1, "Scala" -> 3).toList //List((Java,1), (Scala,3))
        val set: Set[String] = Map("Java" -> 1, "Scala" -> 3).keySet
        val values: Iterable[Int] = Map("Java" -> 1, "Scala" -> 3).values
        println(s"list = ${list}\nset = ${set}\nvalues = ${values}")

        val set2: Set[String] = List("Hdfs", "MySQL", "MySQL", "Hbase").toSet
        val arr: Buffer[String] = List("ActiveMQ", "RabbitMQ", "RocatMQ", "Kafka").toBuffer
        println(s"set2 = ${set2}\narr = ${arr}")


        val tuples: List[(String, Int)] = List("Hdfs", "Hbase").map(e => (e, e.length))
        val map: Map[Char, List[String]] = List("Scala", "Shell", "Python").groupBy(_.head)
        println(s"tuples = ${tuples}\nmap = ${map}")
    }
}
