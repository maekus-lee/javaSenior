package com.atmaekus.oop;

/**
 * 方法重载
 * 1、定义：“两同一不同”：同一个类、相同方法名
 * 参数列表不同：参数个数不同，参数类型不同
 *
 * @author maekus
 * @create 2020-11-25 20:58
 */
public class OverLoad {
    public static void main(String[] args) {
        OverLoad test = new OverLoad();
        test.getsum(1,2);
    }


    public void getsum(int i, int j) {
        System.out.println(i + j);
    }

    public void getsum(double d1, double d2) {
        System.out.println(d1 + d2);
    }

    public void getsum(String s, int i) {

    }

}
