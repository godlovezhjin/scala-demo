package com.zhjin.demo

import util.control.Breaks._

object SortDemo {

    //快速排序
    def quickSort(left: Int, right: Int, arr: Array[Int]): Unit = {
        var l: Int = left
        var r: Int = right
        var pivot = arr((left + right) / 2)
        var temp = 0

        //Array(10, 11, 2, -1, 3)
        breakable {
            while (l < r) {
                //从左点向右遍历,直到找到比中间值大的
                while (arr(l) < pivot) {
                    l += 1
                }

                //从右点向左遍历,直到找到比中间值小的
                while (arr(r) > pivot) {
                    r -= 1
                }

                //判断是否已经越过中间值
                if (l >= r) {
                    break()
                }

                //交换数据
                temp = arr(l)
                arr(l) = arr(r)
                arr(r) = temp
            }
        }

        if (l == r) {
            l += 1
            r -= 1
        }

        //向左递归
        if (left < r) {
            quickSort(left, r, arr)
        }

        //向右递归
        if (right > l) {
            quickSort(l, right, arr)
        }
    }


    //归并排序
    def mergeSort(arr: Array[Int], left: Int, right: Int, temp: Array[Int]): Unit = {
        if (left < right) {

            //取中间值
            val mid: Int = (left + right) / 2

            //分过程：向左递归
            mergeSort(arr, left, mid, temp)

            //分过程：向右递归
            mergeSort(arr, mid + 1, right, temp)

            //合并两个有序数组
            merge(arr, left, mid, right, temp)
        }
    }

    //合并两个有序数组的方法
    def merge(arr: Array[Int], left: Int, mid: Int, right: Int, temp: Array[Int]): Unit = {
        var i: Int = left
        var j: Int = mid + 1
        var t = 0
        while (i <= mid && j <= right) {
            if (arr(i) <= arr(j)) {
                temp(t) = arr(i)
                t += 1
                i += 1
            } else {
                temp(t) = arr(j)
                t += 1
                j += 1
            }
        }
        while (i <= mid) {
            temp(t) = arr(i)
            t += 1
            i += 1
        }
        while (j <= right) {
            temp(t) = arr(j)
            t += 1
            j += 1
        }
        t = 0
        var tempLeft: Int = left
        while (tempLeft <= right) {
            arr(tempLeft) = temp(t)
            t += 1
            tempLeft += 1
        }
    }
}
