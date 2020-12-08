package com.atmaekus.oop.supertest;

/**
 * @author maekus
 * @Description
 * @create 2020-12-07-22:39
 */
public class Person {
    String name;
    int age;
    int id = 2;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃东西");
    }

    public void walk(){
        System.out.println("人走路");
    }
}
