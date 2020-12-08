package com.atmaekus.excer.overwrite;

/**方法重写的规定
 * 1、重写的方法中的权限修饰符不小于父类中的权限修饰符的大小
 * 2、不能重写private方法
 * 3、如果父类返回值类型为void,则子类重写的方法也必须为void;如果父类返回A类型，则子类返回的类型可以是A类或A类的子类
 * 4、如果父类返回基本数据类型，子类重写的也必须返回基本类型
 * 5、子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常
 * @author maekus
 * @Description
 * @create 2020-12-07-22:03
 */
public class Student extends Person{
    private String major;

    Student(){

    }

    //重写父类中的方法
    public void eat(){
        System.out.println("吃好点");
    }
}
