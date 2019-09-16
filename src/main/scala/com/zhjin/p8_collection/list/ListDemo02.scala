package com.zhjin.p8_collection.list

// 二维列表
object ListDemo02 {

    def main(args: Array[String]): Unit = {
        val dim: List[List[Int]] =
            List(
                List(1, 0, 0),
                List(0, 1, 0),
                List(0, 0, 1)
            )

        for (elems <- dim) {
            for (elem <- elems) print(elem + " ")
            println()
        }

        println("==================================")

        val dim2 = (1 :: (0 :: (0 :: Nil))) ::
                (0 :: (1 :: (0 :: Nil))) ::
                (0 :: (0 :: (1 :: Nil))) :: Nil

        for (i <- 0 until dim2.length) {
            for (j <- 0 until dim2(i).length) print(dim2(i)(j) + " ")
            println()
        }
    }
}
