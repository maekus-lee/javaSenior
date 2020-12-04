package com.atmaekus.oop;


/**
 * @author maekus
 * @create 2020-11-24 21:38
 */
/*
* 面向对象学习的三条主线
* 1.java类及类的成员：属性、方法、构造器；代码块、内部类
* 2.面向对象三大特征：封装、继承和多态
* 3.其他关键字  this  super static final abstract interface package import
*
* 类的组成
* 1、属性
* 2、方法
* */
public class OOPTest {
    public static void main(String[] args) {
        //创建Person 类的对象
        Person p1=new Person();

        //调用对象的结构：属性和方法
        //调用对象属性
        p1.name="tom";
        p1.isMale=true;
        System.out.println(p1.name);

        //调用对象方法
        p1.sleep();
        p1.speek("chinese");
    }
}

class Person{
    //属性
    String name;
    int age=1;
    boolean isMale;

    //方法
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void speek(String language){
        System.out.println("人可以讲话"+language);
    }
}
