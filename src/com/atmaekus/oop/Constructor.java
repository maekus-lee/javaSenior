package com.atmaekus.oop;

/**一、构造器
 *
 * @author maekus
 * @create 2020-11-29 13:42
 */
public class Constructor {
    public static void main(String[] args) {
        // 创建对象 = new+构造器
        Person1 p = new Person1();

        p.eat();

        Person1 p1 = new Person1("tom");
        System.out.println(p1.name);
    }
}

class Person1{
    String name;
    int age;

    //构造器
    public Person1(){
        System.out.println("这是默认构造");
    }
    public Person1(String n){
        name = n;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }

}
