package com.atmaekus.excer.extend;

/**定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问
 其父类的成员变量及方法。
 * @author maekus
 * @Description
 * @create 2020-12-07-21:15
 */
public class KidTest {
    public static void main(String[] args) {
        Kids somekid = new Kids(12);

        somekid.printAge();
        somekid.setSalary(0);
        somekid.setSex(0);
        somekid.manorWoman();
        somekid.employeed();
    }
}
