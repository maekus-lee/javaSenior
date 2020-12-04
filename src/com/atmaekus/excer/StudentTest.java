package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-24 23:02
 */
public class StudentTest {
    public static void main(String[] args) {
        //声明student类型数组
        Student[] stus = new Student[20];   //对象数组

        for(int i=0;i<stus.length;i++){
            //给数组元素赋值
            stus[i]=new Student();
            //给Student对象的属性赋值
            stus[i].number = i+1;
            //年纪[1，6]
            stus[i].state = (int)(Math.random()*(6)+1);
            //成绩  [0,100]
            stus[i].score = (int)(Math.random()*(100+1));
        }
        //遍历学生数组
        for(int i=0;i<stus.length-1;i++){
            System.out.println(stus[i].show());
        }
        System.out.println("**********************");
        //使用冒泡法按学生成绩排序，并遍历所有学生信息
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
    int number;  //学号
    int state;   //年级
    int score;

    public String show(){
        return "学号:"+number+",年级"+state+",成绩"+score;
    }

}
