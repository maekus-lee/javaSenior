package com.atmaekus.oop;

/**һ��������
 *
 * @author maekus
 * @create 2020-11-29 13:42
 */
public class Constructor {
    public static void main(String[] args) {
        // �������� = new+������
        Person1 p = new Person1();

        p.eat();

        Person1 p1 = new Person1("tom");
        System.out.println(p1.name);
    }
}

class Person1{
    String name;
    int age;

    //������
    public Person1(){
        System.out.println("����Ĭ�Ϲ���");
    }
    public Person1(String n){
        name = n;
    }

    public void eat(){
        System.out.println("�˳Է�");
    }

    public void study(){
        System.out.println("�˿���ѧϰ");
    }

}
