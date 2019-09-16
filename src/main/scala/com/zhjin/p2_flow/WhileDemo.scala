package com.zhjin.p2_flow

object WhileDemo {

    def while_demo(): Unit = {
        //while
        var i = 1
        while (i <= 5) {
            print(i + "\t")
            i += 1
        }
        println("----------------------------------")

        //do...while
        var j = 1
        do {
            print(j + "\t")
            j += 1
        } while (j <= 5)
    }


    //循环中断
    def while_break(): Unit = {
        var i = 1
        while (i <= 10) {
            if (i == 5) {
                util.control.Breaks.break()
            }
            print(i + "\t")
            i += 1
        }
        println("ok~~~~~~")
    }

    def while_breakable(): Unit = { //TODO 本质是控制抽象
        util.control.Breaks.breakable {
            var i = 1
            while (i <= 10) {
                if (i == 5) util.control.Breaks.break()
                print(i + "\t")
                i += 1
            }
        }
        println("ok~~~~~~")
    }

    def for_breakable(): Unit = {
        util.control.Breaks.breakable {
            for (i <- 1 to 10) {
                if (i == 5) util.control.Breaks.break()
                print(i + "\t")
            }
        }
    }

    //用循环守卫实现break的效果-------100以内的数求和,求出当和第一次大于20的和是多少
    def break_guard(): Unit = {
        var sum = 0
        var flag = true
        for (i <- 1 to 100 if flag) {
            sum += i
            if (sum > 20) {
                flag = false
            }
        }
        printf("第一次大于20的和 %s\n", sum)
    }

    def main(args: Array[String]): Unit = {
        // while_demo()
        // while_break()
        // while_breakable()
        for_breakable
        // break_guard
    }
}
