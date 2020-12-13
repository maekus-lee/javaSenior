package com.atmaekus.excer.duotai;

/**
 * 面向对象多态性
 * 1、可以理解为一个事务的多种形态
 * 2、何为多态性：
 *   对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * 3、多态的使用：虚拟方法调用
 *    有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
 *    总结：编译，看左边；运行，看右边（均指实例化对象的等号左右）
 * 4、多态的使用前提：
 *     1）存在继承
 *     2）子类重写父类方法
 * 5、多态不适用于属性
 * @author maekus
 * @Description
 * @create 2020-12-13-22:30
 */
public class duotaiTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();

        //*********************************
        System.out.println("*****************");
        //子类对象的多态性：父类的引用指向子类的对象,实际调用子类重写的父类方法
        Person p2 = new Man();
        p2.eat();
        Person p3 = new Man();
    }
}
