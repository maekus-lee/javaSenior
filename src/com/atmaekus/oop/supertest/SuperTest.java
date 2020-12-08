package com.atmaekus.oop.supertest;

import java.net.PortUnreachableException;

/**Super关键字的使用
 * 1、理解为父类的
 * 2、super可以用来调用：属性、方法、构造器
 * 3、super的使用
 *     3.1 我们可以在子类的方法或构造去中，通过使用super.属性 或super.方法的方式，显式地使用 ，通常情况下super可以省略
 *     3.2 子类重写父类地方法后，如果要调用父类地方法，需要使用super.方法
 * 4、super调用父类构造器
 *   4.2我们可以在子类地构造器中显示地使用super（形参列表）地方式，调用父类中声明的指定的构造器
 *   4.3 super(形参列表)的使用，必须声明在子类构造器的首行
 *  4.3 我们在类的构造器中，针对与”this(形参列表)“或”super（形参列表）“,则默认调用的是父类中空参的构造器
 *  4.4 在类的多个构造器中，至少有一个类调用了父类的super();
 * @author maekus
 * @Description
 * @create 2020-12-07-22:40
 */
public class SuperTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.show();
    }
}
