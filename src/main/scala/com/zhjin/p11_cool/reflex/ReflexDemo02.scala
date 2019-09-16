package com.zhjin.p11_cool.reflex

//反射
object ReflexDemo02 extends App {
    //一、通过反射创建类型实例：
    //得到JavaUniverse用于反射
    val ru = scala.reflect.runtime.universe
    //得到一个JavaMirror,一会用于反射Person.class
    val mirror = ru.runtimeMirror(getClass.getClassLoader)
    //得到Person类的Type对象后,得到type的特征值并转为ClassSymbol对象
    val classPerson = ru.typeOf[Person].typeSymbol.asClass
    //得到classMirror对象
    val classMirror = mirror.reflectClass(classPerson)
    //得到构造器Method
    val constructor = ru.typeOf[Person].decl(ru.termNames.CONSTRUCTOR).asMethod
    //得到MethodMirror
    val methodMirror = classMirror.reflectConstructor(constructor)
    //实例化该对象
    val p = methodMirror("Mike", 18)
    println(s"p = $p")


    //二、通过反射调用方法：
    val instanceMirror = mirror.reflect(p)
    //得到Method的Mirror
    val infoMethod = ru.typeOf[Person].decl(ru.TermName("info")).asMethod
    val myPrintMethod = ru.typeOf[Person].decl(ru.TermName("myPrint")).asMethod
    //通过Method的Mirror索取方法
    val info = instanceMirror.reflectMethod(infoMethod)
    val myPrint = instanceMirror.reflectMethod(myPrintMethod)

    //运行方法
    println("info方返回值：" + info(10))
    myPrint()


    //三、通过反射访问属性：
    //得到属性Field的Mirror
    val nameField = ru.typeOf[Person].decl(ru.TermName("name")).asTerm
    val ageField = ru.typeOf[Person].decl(ru.TermName("age")).asTerm
    //通过Field的Mirror索取属性
    val name = instanceMirror.reflectField(nameField)
    val age = instanceMirror.reflectField(ageField)

    println(s"name = ${name.get} age = ${age.get}")
}

//实体类
class Person(name: String, age: Int) {
    def info(n: Int) = {
        n + age
    }

    def myPrint() = {
        println(s"myPrint方法调用：$name-$age")
    }

    override def toString = s"Person: name = ${name}, age = ${age}"
}
