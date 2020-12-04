package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-29 14:47
 */
public class Girl {
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

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    /**
     * @description 比较两个对象的大小
     * @param girl
     * @return  正数：当前对象大  负数：当前对象小  0：当前对象与形参对象相等
     */
    public int compare(Girl girl){
         return this.age-girl.age;
    }

}
