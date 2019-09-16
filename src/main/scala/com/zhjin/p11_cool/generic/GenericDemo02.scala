package com.zhjin.p11_cool.generic

import com.zhjin.p11_cool.generic.SeasonEnum.SeasonEnum

/**
  * 范型---案例2：
  * 1.设计一个EnglishClass(英语班级类),在创建EnglishClass的一个实例时,需要指定
  * [班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
  * 2.开班季节只能是指定的,班级名称为 String, 班级类型是(字符串类型 "高级班", "初级班")或者是Int类型(1,2,3)
  */
object GenericDemo02 {

    def main(args: Array[String]): Unit = {
        //使用 EnglishClass (英语班级类)
        val class01 = new EnglishClass[SeasonEnum, String, String](SeasonEnum.spring, "JavaEE", "高级班")
        val class02 = new EnglishClass[SeasonEnum, String, Int](SeasonEnum.autumn, "BigData", 1)

        println(s"calss01：${class01.season} ${class01.name} ${class01.classType}")
        println(s"calss02：${class02.season} ${class02.name} ${class02.classType}")
    }
}

//先编写一个枚举类型--季节
object SeasonEnum extends Enumeration {
    type SeasonEnum = Value //自定义SeasonEnum,是Value类型,这样才能使用
    //四个值
    val spring, summer, winter, autumn = Value
}

//根据业务需求，设计带有泛型类.
class EnglishClass[A, B, C](val season: SeasonEnum.SeasonEnum, val name: B, val classType: C)