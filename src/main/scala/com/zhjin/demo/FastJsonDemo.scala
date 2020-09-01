package com.zhjin.demo

import java.util

import com.alibaba.fastjson.serializer.SerializerFeature
import com.alibaba.fastjson.{JSON, JSONObject}

/**
  * scala调JSON.toJSONString时必须指定 SerializerFeature,不然无隐式转换会报错
  *
  * jsonObject.putAll  scala报错
  * map.putAll         scala可用
  */
object FastJsonDemo {

    def main(args: Array[String]): Unit = {
        val arr = Array[String]("Java", "Scala", "Python")
        // val json = arr.map(r => JSON.toJSONString(r, SerializerFeature.EMPTY: _*)).mkString("[", ",", "]")
        val json = arr.map(r => JSON.toJSONString(r, SerializerFeature.EMPTY: _*)).mkString(" ")
        println(s"=====> json: ${json}")

        val obj = new JSONObject()
        obj.put("id", 1001)
        obj.put("name", "zhjin")
        obj.put("age", null)
        // val str1: String = JSON.toJSONString(obj)  --TODO 报错
        // println(s"=====> str1: ${str1}")
        val str2: String = JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue)
        println(s"=====> str2: ${str2}")
        val str3: String = JSON.toJSONString(obj, SerializerFeature.EMPTY: _*)
        println(s"=====> str3: ${str3}")


        //====================================================================


        val map1: util.Map[String, Int] = new util.HashMap[String, Int]()
        map1.put("Java", 1)
        map1.put("Scala", 2)
        val map2: util.Map[String, Int] = new util.HashMap[String, Int]()
        map2.put("Spark", 3)
        map2.put("Flink", 4)
        map1.putAll(map2)
        println(s"====> map1: ${map1}")


        var jsonObject1: JSONObject = new JSONObject()
        jsonObject1.put("Java", 1)
        jsonObject1.put("Scala", 2)
        var jsonObject2: JSONObject = new JSONObject()
        jsonObject2.put("Spark", 3)
        jsonObject2.put("Flink", 4)
        // jsonObject1.putAll(jsonObject2) -- TODO 报错
        println(s"====> jsonObject1: ${jsonObject1}")


        val j1 = jsonObject1.asInstanceOf[util.Map[String, AnyRef]]
        j1.putAll(jsonObject2.asInstanceOf[util.Map[String, AnyRef]])
        jsonObject1 = new JSONObject(j1)
        println(s"====> jsonObject1: ${jsonObject1}")
    }
}
