package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-24 23:02
 */
public class StudentTest {
    public static void main(String[] args) {
        //����student��������
        Student[] stus = new Student[20];   //��������

        for(int i=0;i<stus.length;i++){
            //������Ԫ�ظ�ֵ
            stus[i]=new Student();
            //��Student��������Ը�ֵ
            stus[i].number = i+1;
            //���[1��6]
            stus[i].state = (int)(Math.random()*(6)+1);
            //�ɼ�  [0,100]
            stus[i].score = (int)(Math.random()*(100+1));
        }
        //����ѧ������
        for(int i=0;i<stus.length-1;i++){
            System.out.println(stus[i].show());
        }
        System.out.println("**********************");
        //ʹ��ð�ݷ���ѧ���ɼ����򣬲���������ѧ����Ϣ
        for(int i=0;i<stus.length-1;i++){
            for(int j=0;j<stus.length-1-i;j++){
                if(stus[j].score>stus[j+1].score){
                    int temp = stus[j].score;
                    stus[j].score = stus[j+1].score;
                    stus[j+1].score = temp;
                }
            }
        }
        for(int i=0;i< stus.length-1;i++){
            System.out.println(stus[i].show());
        }

    }
}

class Student{
    int number;  //ѧ��
    int state;   //�꼶
    int score;

    public String show(){
        return "ѧ��:"+number+",�꼶"+state+",�ɼ�"+score;
    }

}
