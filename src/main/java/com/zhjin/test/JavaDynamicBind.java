package com.zhjin.test;

/**
 * 1.对象调用方法时,该方法会和该对象的内存地址绑定(即不管对象指向那个本身还是父类的引用,都调子类的)----动态绑定
 * 2.对象调用属性时,没有动态绑定机制,谁的引用调用就返回谁的值
 * 3.Java中子类和父类定义相同的字段不会报错,对于同一个对象,用父类的引用取得是父类的字段,
 * 用子类的引用取得是子类的字段
 */
public class JavaDynamicBind {
    public static void main(String[] args) {
        //动态绑定
        A a = new B();
        System.out.println(a.sum());  //40
        System.out.println(a.sum1()); //30

        //字段重写
        A aa = new B();
        B bb = new B();
        System.out.println(aa.i);//10
        System.out.println(bb.i);//20
        System.out.println(((B) aa).i);//20
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}
