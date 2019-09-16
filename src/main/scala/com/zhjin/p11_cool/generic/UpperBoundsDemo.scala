package com.zhjin.p11_cool.generic

//上界
object UpperBoundsDemo {

    def main(args: Array[String]): Unit = {
        //传统的方法
        val compareInt = new CompareInt(10, 12)
        println(compareInt.greater) // 12
        val compareFloat = new CompareFloat(1.2F, 3.4F)
        println(compareFloat.greater) // 3.4


        //使用上界来进行比较
        val compareInt2 = new CompareComm[Integer](Integer.valueOf(10), Integer.valueOf(12))
        println(compareInt2.greater)
        val compareFloat2 = new CompareComm[java.lang.Float](java.lang.Float.valueOf(1.2F), java.lang.Float.valueOf(3.4F))
        println(compareFloat2.greater) // 3.4


        //上界简写---隐式转换
        val compareInt3 = new CompareComm[Integer](10, 12)
        println(compareInt3.greater)
        val compareFloat3 = new CompareComm[java.lang.Float](1.2F, 3.4F)
        println(compareFloat3.greater) // 3.4


        //视图界定
        val compareInt4 = new CompareComm2[Int](10, 12)
        println(compareInt4.greater)
    }
}


//比较两个整数的大小---返回大的
class CompareInt(n1: Int, n2: Int) {
    def greater = if (n1 > n2) n1 else n2
}

//比较两个Float的大小---返回大的
class CompareFloat(n1: Float, n2: Float) {
    def greater = if (n1 > n2) n1 else n2
}


/**
  * T <: Comparable[T] 表示范型是Comparable的子类
  */
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {
    def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}

/**
  * <% 视图界定 = 上界 + 隐式转换
  */
class CompareComm2[T <% Comparable[T]](obj1: T, obj2: T) {
    def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}