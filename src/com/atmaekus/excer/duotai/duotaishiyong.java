package com.atmaekus.excer.duotai;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

/**多态使用举例
 * @author maekus
 * @Description
 * @create 2020-12-13-22:43
 */
public class duotaishiyong {
    public static void main(String[] args) {
        duotaishiyong d1 = new duotaishiyong();
        d1.func(new Dog());

        d1.func(new Cat());
    }
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物吃");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void shout(){
        System.out.println("wang wang wang");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shout(){
        System.out.println("miao miao miao");
    }
}
