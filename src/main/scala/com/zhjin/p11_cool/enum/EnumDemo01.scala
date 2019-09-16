package com.zhjin.p11_cool.enum

//枚举
object EnumDemo01 {

    def main(args: Array[String]): Unit = {
        //测试：
        println(WeekEnum.Monday) //星期一
        println(WeekEnum.Monday.id) //1
        println("========================")

        //遍历
        val values = WeekEnum.values
        for (e <- values) print(e + "  ")
        println("\n========================")


        //测试：
        println(TrafficLight.Red)
        println(TrafficLight.Red.id)
    }
}

//定义星期的枚举
object WeekEnum extends Enumeration {
    val Monday = Value(1, "星期一")
    val Tuesdayw = Value(2, "星期二")
    val Wednesday = Value(3, "星期三")
    val Thursday = Value(4, "星期四")
    val Friday = Value(5, "星期五")
    val Saturday = Value(6, "星期六")
    val Sunday = Value(7, "星期天")
}


object TrafficLight extends Enumeration {
    val Red = Value(0, "Stop")
    val Yellow = Value(1, "Slow")
    val Green = Value(2, "Go")
}
