package com.atmaekus.oop;

/**  可变形参定义方法
 *    jdk5.0以后新增的方法
 * @author maekus
 * @create 2020-11-25 21:18
 */
public class MethodArgs {
    public static void main(String[] args) {
        MethodArgs test = new MethodArgs();
        test.show();   //show3
        test.show("1","2");   //show3
        test.show("1");   //show2
    }
    public void show(int i){
        System.out.println("show1");
    }

    public void show(String i){
        System.out.println("show2");
    }

    public void show(String ... strs){    // ...的方式可实现不定长方式的传参,传入数组也可以
        System.out.println("show3");
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }

   // public void show(String[] strs){   和上面的方法构成了重复

    //}
    public void show(int i,String ... strs){   //可变形参只能写在后面

    }
}
