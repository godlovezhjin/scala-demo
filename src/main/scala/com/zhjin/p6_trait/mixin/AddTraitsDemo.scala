package com.zhjin.p6_trait.mixin


//叠加特质：
//  创建一个动态混入对象时,叠加特质创建对象的顺序：从左到右
//  执行一个动态混入对象的方法时,执行顺序：从右到左
//  执行动态混入对象方法遇到super时,优先找其左边的特质,若左边找不到才找父特质
object AddTraitsDemo {
    def main(args: Array[String]): Unit = {
        // ~~~Operate~~~
        // ~~~Data~~~
        // ~~~DB2~~~
        // ~~~File~~~
        val mysql = new MySQL with DB2 with File
        println(mysql)

        mysql.insert(1001) // 向文件 向数据库 插入数据：1001
    }
}


trait Operate {
    println("~~~Operate~~~")

    def insert(id: Int)
}

trait Data extends Operate {
    println("~~~Data~~~")

    override def insert(id: Int): Unit = {
        print("插入数据：" + id)
    }
}

trait DB2 extends Data {
    println("~~~DB2~~~")

    override def insert(id: Int): Unit = {
        print("向数据库 ")
        super.insert(id)
    }
}

trait File extends Data {
    println("~~~File~~~")

    override def insert(id: Int): Unit = {
        print("向文件 ")
        // super.insert(id)
        super[Data].insert(id)
    }
}

class MySQL {}
