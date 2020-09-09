package com.zhjin.p8_collection.operate

//排序、反转
object SortByOperate {

    case class Employee(val name: String, val age: Int, val salary: Double)

    def main(args: Array[String]): Unit = {
        /** ***********************基础函数 ************************************/
        val list = List(1, 3, 5, 7, 9, 2, 4, 6, 8, 10)
        println("反转：" + list.reverse)
        println("自然排序：" + list.sorted)
        println("倒序1：" + list.sortWith((a, b) => a > b))
        println("倒序2：" + list.sortBy(a => -a))
        println("倒序3：" + list.sortBy(a => a)(Ordering.Int.reverse))


        //定义map集合---元素是2元组
        val map = Map("Hadoop" -> 90, "Spark" -> 95, "Java" -> 93, "Linux" -> 88).toList
        println(s"排序前 map = ${map}")
        val res1 = map.sortBy(e => e._1)
        val res2 = map.sortBy(_._2).reverse
        println(s"按第一个元素正序 = ${res1}\n按第二个元素倒序 = ${res2}")


        /** ***********************多字段排序---练习1(元组集) ************************************/
        val arr = Array(("a", 1), ("c", 3), ("c", 9), ("a", 7), ("b", 2))
        print("排序前：")
        arr.foreach(print(_))

        //方式1---先按第1个字段升序,再按第2个字段降序
        val res3 = arr.sortWith {
            case (a, b) => {
                if (a._1 != b._1) a._1 < b._1 //< 升序
                else a._2 > b._2 //> 降序
            }
        }
        print("\n排序后 sortWith：")
        res3.foreach(print)

        //方式2---先按第1个字段升序,再按第2个字段降序
        val res4 = arr.sortBy(r => (r._1, r._2))(Ordering.Tuple2(Ordering.String, Ordering.Int.reverse))
        print("\n排序后 sortBy：")
        res4.foreach(print)


        /** ***********************多字段排序---练习2(实体集) ************************************/
        val e1 = Employee("zhang3", 23, 20000.0)
        val e2 = Employee("li4", 25, 22000.0)
        val e3 = Employee("wang5", 18, 20000.0)
        val e4 = Employee("zhao6", 23, 18000.0)
        val e5 = Employee("tian7", 25, 22000.0)
        val e6 = Employee("jiang8", 23, 18000.0)
        val emps = List(e1, e2, e3, e4, e5, e6)
        println("\n排序前 emps：" + emps)

        //方式1---先工资降序 再年龄升序 再姓名升序
        val res5 = emps.sortBy(e => (e.salary, e.age, e.name))(Ordering.Tuple3(Ordering.Double.reverse, Ordering.Int, Ordering.String))
        println("排序后 sortBy：" + res5)

        //方式2---先工资降序 再年龄升序 再姓名升序
        val res6 = emps.sortWith {
            case (e1, e2) => {
                e1.salary != e2.salary match {
                    case true => e1.salary > e2.salary
                    case false => {
                        e1.age != e2.age match {
                            case true => e1.age < e2.age
                            case false => e1.name < e2.name
                        }
                    }
                }
            }
        }
        println("排序后 sortWith：" + res6)
    }
}
