package com.atmaekus.oop;

/**������������һ����װ��
 *
 * ��װ�Ե����֣�
 * ���ǽ��������XXX˽�л���private����ͬʱ�ṩ�����ģ�public����������ȡ��getxxx�������ô����Ե�ֵ��setXXX��
 * @author maekus
 * @create 2020-11-29 10:45
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "���";
        a.age = 10;
        // a.legs = 4;   ˽�����Բ���ֱ�Ӹ�ֵ

        a.setLegs(-6);

        a.show();
    }
}

class Animal{
    String name;
    int age;
    private int legs;

    //�����Ե�����
    public void setLegs(int l){
        if(l>=0&&l%2==0){
            legs = l;
        }else{
            legs = 0;
        }
    }

    //�����ԵĻ�ȡ
    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("�����ʳ");
    }

    public void show(){
        System.out.println("name="+name+",age="+age+",legs="+legs);
    }
}