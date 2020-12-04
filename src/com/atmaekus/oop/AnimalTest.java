package com.atmaekus.oop;

/**面向对象的特征一：封装性
 *
 * 封装性的体现：
 * 我们将类的属性XXX私有化（private），同时提供公共的（public）方法来获取（getxxx）和设置此属性的值（setXXX）
 * @author maekus
 * @create 2020-11-29 10:45
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 10;
        // a.legs = 4;   私有属性不能直接赋值

        a.setLegs(-6);

        a.show();
    }
}

class Animal{
    String name;
    int age;
    private int legs;

    //对属性的设置
    public void setLegs(int l){
        if(l>=0&&l%2==0){
            legs = l;
        }else{
            legs = 0;
        }
    }

    //对属性的获取
    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name="+name+",age="+age+",legs="+legs);
    }
}