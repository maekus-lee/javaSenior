package com.atmaekus.oop;


/**
 * @author maekus
 * @create 2020-11-24 21:38
 */
/*
* �������ѧϰ����������
* 1.java�༰��ĳ�Ա�����ԡ�������������������顢�ڲ���
* 2.�������������������װ���̳кͶ�̬
* 3.�����ؼ���  this  super static final abstract interface package import
*
* ������
* 1������
* 2������
* */
public class OOPTest {
    public static void main(String[] args) {
        //����Person ��Ķ���
        Person p1=new Person();

        //���ö���Ľṹ�����Ժͷ���
        //���ö�������
        p1.name="tom";
        p1.isMale=true;
        System.out.println(p1.name);

        //���ö��󷽷�
        p1.sleep();
        p1.speek("chinese");
    }
}

class Person{
    //����
    String name;
    int age=1;
    boolean isMale;

    //����
    public void sleep(){
        System.out.println("�˿���˯��");
    }
    public void speek(String language){
        System.out.println("�˿��Խ���"+language);
    }
}
