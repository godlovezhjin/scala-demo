package com.zhjin.p5_package

//包的引入
object TestImport {

    import scala.beans.BeanProperty

    @BeanProperty var name: String = ""
}


class Dog {

    import scala.beans.BeanProperty

    @BeanProperty var name: String = ""


    import scala.collection.mutable.{HashMap, HashSet}
    import java.util.{ArrayList => JavaArrayList}

    var map = new HashMap()
    var set = new HashSet()
    var list = new JavaArrayList()


}

class User {

    import scala.beans.BeanProperty

    @BeanProperty var name: String = ""

}