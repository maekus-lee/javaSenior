package com.atmaekus.oop.supertest;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.security.PublicKey;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-22:40
 */
public class Student extends Person{
    String major;
    int id =1002;

    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    public Student(String name,int age,String major){  //重写了父类地构造器
        super(name, age);    //使用super调用父类地构造器，必须在首行
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生吃");
    }
    public void study(){
        System.out.println("学习");
    }

    public void show(){
        System.out.println("name="+name+"age="+age);
        System.out.println("id="+id);
        System.out.println("id="+super.id);
    }
}
