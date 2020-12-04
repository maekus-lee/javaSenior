package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-29 14:42
 */
public class Boy {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    //方法
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }
    public void shout(){
        if(this.age>=22){
            System.out.println("合法");
        }else{
            System.out.println("不合法");
        }
    }
}
