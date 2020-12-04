package com.atmaekus.excer;

/**
 * @author maekus
 * @create 2020-11-25 21:14
 */

/**
 * 1、编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
 * 执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 2.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
 * 法求两个double值中的最大值，第三个方法求三个double值中的最大值，
 * 并分别调用三个方法。
 *
 */
public class OverLoadExer {
    public static void main(String[] args) {

    }
    public void mol(int i){
        System.out.println(i*i);
    }

    public void mol(int i,int j){
        System.out.println(i*j);
    }
}
