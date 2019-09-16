package com.zhjin.p4_oop.innerclass

//类型投影
object InnerClasssDemo02 {
    def main(args: Array[String]): Unit = {
        val outer3 = new OuterClass3
        val outer32 = new OuterClass3
        val inner3 = new outer3.InnerClass3
        val inner32 = new outer32.InnerClass3
        inner3.test(inner3)
        //inner3.test(inner32)----报错

        val outer4 = new OuterClass4
        val outer42 = new OuterClass4
        val inner4 = new outer4.InnerClass4
        val inner42 = new outer42.InnerClass4
        inner4.test(inner4)
        inner4.test(inner42)
    }
}

class OuterClass3 {
    myOuter =>

    class InnerClass3 { //成员内部类
        def test(ic: InnerClass3): Unit = { //这样写,不同的外部对象创建的内部实例,是有匹配问题
            System.out.println(ic)
        }
    }

}

class OuterClass4 {
    myOuter =>

    class InnerClass4 { //成员内部类
        def test(ic: OuterClass4#InnerClass4): Unit = { //这样写,不同的外部对象创建的内部实例,是可以的
            System.out.println(ic)
        }
    }

}