//package com.atmaekus.oop;
//
///**
// * @author maekus
// * @create 2020-11-25 22:32
// */
//
///**
// * 关于变量的赋值：
// * 如果变量是基本数据类型，此时赋值的是变量所保存的数据值
// * 如果变量是引用数据类型（类（包含String）,interface,数组等）,此时赋值的是变量所保存的数据的地址
// */
//public class ValueTransfer {
//    public static void main(String[] args) {
//        System.out.println("*********传统数据类型***************");
//        int m=10;
//        int n=m;
//
//        System.out.println("m="+m+",n="+n);
//
//        n=20;
//        System.out.println("m="+m+",n="+n);
//        System.out.println("***********引用数据类型**************");
//
//        QuanXian o1=new QuanXian();
//        o1.orderId=1000;
//
//        QuanXian o2=o1;   //赋值后，o1和o2的地址值相同
//
//        System.out.println("o1"+o1.orderId+",o2"+o2.orderId);
//
//        o2.orderId = 2000;
//        System.out.println("o1"+o1.orderId+",o2"+o2.orderId);
//
//    }
//}
//class Order{
//    int orderId;
//}
